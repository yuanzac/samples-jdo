/**********************************************************************
Copyright (c) 2006 Andy Jefferson and others. All rights reserved.
Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.

Contributors:
    ...
**********************************************************************/
package org.datanucleus.samples.jdo.many_many_attributed;

import java.util.HashSet;
import java.util.Set;

public class Supplier
{
    long id;
    String name = null;
    Set<BusinessRelation> customerRelations = new HashSet();

    public Supplier(String name)
    {
        this.name = name;
    }

    public String getName()
    {
        return name;
    }

    public void addRelation(BusinessRelation rel)
    {
        customerRelations.add(rel);
    }

    public void removeRelation(BusinessRelation rel)
    {
        customerRelations.remove(rel);
    }

    public Set<BusinessRelation> getRelations()
    {
        return customerRelations;
    }

    public int getNumberOfRelations()
    {
        return customerRelations.size();
    }

    public String toString()
    {
        return "Supplier : " + name + " - " + customerRelations.size() + " customers";
    }
}
