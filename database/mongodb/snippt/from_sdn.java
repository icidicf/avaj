public void findMatchesForLbgroupLatest(String collection, String ip) {
    System.out.println("enter latest ip is " + ip.toString());
    DBCollection dbCollection = this.db.getCollection(collection);
    BasicDBObject query = new BasicDBObject("_nodeip", ip);
    DBObject resultOne = dbCollection.findOne(query);
    System.out.println("this is find one test size is 1 "+ resultOne.toString());
    return ;
}

