package epam_customcollection;

import java.util.logging.Logger;

/**
 * Hello world!
 *
 */
public class App 
{
    private static final Logger logger = Logger.getLogger((epam_customcollection.App.class.getName()));

    public static void main( String[] args )
    {
        customlist<Integer> list = new customlist<Integer>();

        logger.severe("Initiating List");
        for(int i=0;i<15;i++)
            list.add(i);

        logger.info("LIST : ");
        String res=list.toString();
        logger.info(res);
        logger.info("Removing 3 and 4 from list");
        logger.info("Element removed " +list.remove(3));
        logger.info("Element removed " +list.remove(3));
        logger.info("Size of my list : "+list.size());
        logger.info("LIST : ");
        res = list.toString();
        logger.info(res);
    }
}
