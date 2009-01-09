package org.jboss.webbeans.tck.impl;

import org.jboss.webbeans.context.AbstractContext;
import org.jboss.webbeans.context.RequestContext;
import org.jboss.webbeans.tck.api.Contexts;

public class ContextsImpl implements Contexts<AbstractContext>
{

   public RequestContext getRequestContext()
   {
      throw new UnsupportedOperationException("Not yet implemented");
   }

   public void setActive(AbstractContext context)
   {
      context.setActive(true);
   }

   public void setInactive(AbstractContext context)
   {
      context.setActive(false);
   }
   
   
   
}