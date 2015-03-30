package com.imadarchid.meteomaroc;

import  com.parse.Parse;
        import com.parse.ParseInstallation;
        import com.parse.PushService;

public class Application extends android.app.Application {

    //Parse Integration, hna kaynin les API keys
        public void onCreate() {
            Parse.initialize(this, "1j9U6ReDCZOFZX9SwQ9kID930RnZ1DiYRSu3on2A", "mIoGNSIU2tkbAshTkHJesOm7qXoFfBIMyIEsfk2z");
        }



    }
