import com.mongodb.*;

/**
 * Created by leo on 2017/2/10.
 */
public class MongodbTest {

    public static void main(String[] args) throws Exception {

        /**
         * Mongo�������MongoDB�����������ӣ��ж��ֹ��캯�����޲ι��캯��Ĭ������localhost:27017.
         */
        Mongo connection = new Mongo();
        /**
         * DB��������ݿ⣬�����ǰ��������û�и����ݿ⣬��Ĭ�ϴ���һ��
         */
        DB db = connection.getDB("mylearndb");
        /**
         * DBCollection�����ϣ�������ݿ���û�иü��ϣ���Ĭ�ϴ���һ��
         */
        DBCollection users = db.getCollection("users");
        /**
         * DBObject�����ĵ�������һ���ӿڣ�java���ṩ�˶���ʵ�֣���򵥵ľ���BasicDBObject��
         */
        DBObject user = new BasicDBObject();
        user.put("name", "jimmy");
        user.put("age", "34");
        DBObject address = new BasicDBObject();
        address.put("city", "bj");
        address.put("street", "bq road");
        address.put("mail", "ufpark 68#");
        /**
         * ������Ƕ�ĵ���������Ҫ�Ƚ���Ƕ�ĵ���������䵽����ĵ��У�
         */
        user.put("address", address);
        // �����ĵ����뵽������
        users.insert(user);
        // �Ӽ����в�ѯ���ݣ����ǾͲ�ѯһ��������findOne����
        DBObject dbUser = users.findOne();
        System.out.println("name" + " : "  + dbUser.get("name") );
        System.out.println("age" + " : "  + dbUser.get("age") );
        DBObject dbAddress = (DBObject)user.get("address");
        System.out.println("city" + " : "  + dbAddress.get("city") );
        System.out.println("street" + " : "  + dbAddress.get("street") );
        System.out.println("mail" + " : "  + dbAddress.get("mail") );
    }
}
