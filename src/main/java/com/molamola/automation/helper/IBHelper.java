package com.molamola.automation.helper;

import com.ib.client.EClientSocket;
import com.ib.client.EReaderSignal;
import lombok.extern.slf4j.Slf4j;

import java.io.IOException;

@Slf4j
public class IBHelper {
    private String host;
    private int port;

    private EClientSocket eClientSocket;
    private IBRecevier iBRecevier;

    public IBHelper(String host, int port) throws IOException
    {
        log.info("IBHelper init");
        iBRecevier = new IBRecevier();
        EReaderSignal eReaderSignal = new EReaderSignal() {
            @Override
            public void issueSignal() {

            }

            @Override
            public void waitForSignal() {

            }
        };

        eClientSocket = new EClientSocket(iBRecevier, eReaderSignal);
        try {
            eClientSocket.eConnect(host, port, 1);
            log.info("Connection finished");
            log.info(GetStatus());
        }catch (Exception ex){
            log.error("Connection Error.", ex);
        }
    }

    public String GetStatus(){
        return eClientSocket.isConnected() ? "CONNECTED" : "FAILED";
    }

}
