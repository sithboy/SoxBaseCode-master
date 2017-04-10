//
//  ViewController.swift
//  CommentAdder
//
//  Created by Dave Tille on 3/20/17.
//  Copyright © 2017 Dave Tille. All rights reserved.
//

import UIKit

class ViewController: UIViewController {
    
    let addCommentURL = URL(string: "http://hardbooter.org/soxwebservice/api/newComment.php")
        
        
    @IBOutlet var textComment: UITextField!
        
    @IBOutlet var textUserID: UITextField!
        
        
    @IBAction func saveButton(_ sender: Any) {
    
    
    
 
        
        
        //creating NSMutableURLRequest
        let request = NSMutableURLRequest(url: addCommentURL!)
        
        //setting the method to post
        request.httpMethod = "POST"
        
        //getting values from text fields
        let comment = textComment.text
        let userID = textUserID.text
        
        //creating the post parameter by concatenating the keys and values from text field
        let postParameters = "comment="+comment!+"&userID="+userID!;
        
        //adding the parameters to request body
        request.httpBody = postParameters.data(using: String.Encoding.utf8)
        
        
        //creating a task to send the post request
        let task = URLSession.shared.dataTask(with: request as URLRequest) {data, response, error in
            
            if error != nil{
                print("error is \(error)")
                return;
            }
            
            //parsing the response
            do {
                //converting resonse to NSDictionary
                let myJSON =  try JSONSerialization.jsonObject(with: data!, options: .mutableContainers) as? NSDictionary
                
                //parsing the json
                if let parseJSON = myJSON {
                    
                    //creating a string
                    var msg : String!
                    
                    //getting the json response
                    msg = parseJSON["message"] as! String?
                    
                    //printing the response
                    print(msg)
                    
                }
            } catch {
                print(error)
            }
            
        }
        //executing the task
        task.resume()
        
        
        
    }

    override func viewDidLoad() {
        super.viewDidLoad()
        // Do any additional setup after loading the view, typically from a nib.
    }

    override func didReceiveMemoryWarning() {
        super.didReceiveMemoryWarning()
        // Dispose of any resources that can be recreated.
    }


}

