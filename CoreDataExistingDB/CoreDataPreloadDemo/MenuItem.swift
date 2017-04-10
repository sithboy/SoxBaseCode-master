//
//  MenuItem.swift
//  SoxCoreData
//
//  Created by Dave Tille on 3/7/17.
//  Copyright © 2017 Dave Tille. All rights reserved.
//

import Foundation
import CoreData

class MenuItem: NSManagedObject {
    @NSManaged var name:String?
    @NSManaged var detail:String?
    @NSManaged var price:NSNumber?
    
}
