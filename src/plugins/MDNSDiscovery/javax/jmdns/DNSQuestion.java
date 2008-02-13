//Copyright 2003-2005 Arthur van Hoff, Rick Blair
//Licensed under Apache License version 2.0
//Original license LGPL


package plugins.MDNSDiscovery.javax.jmdns;

/**
 * A DNS question.
 *
 * @version %I%, %G%
 * @author	Arthur van Hoff
 */
final class DNSQuestion extends DNSEntry
{
    /**
     * Create a question.
     */
    DNSQuestion(String name, int type, int clazz)
    {
        super(name, type, clazz);
    }

    /**
     * Check if this question is answered by a given DNS record.
     */
    boolean answeredBy(DNSRecord rec)
    {
        return (clazz == rec.clazz) && ((type == rec.type) || (type == DNSConstants.TYPE_ANY)) &&
            name.equals(rec.name);
    }

    /**
     * For debugging only.
     */
    public String toString()
    {
        return toString("question", null);
    }
}