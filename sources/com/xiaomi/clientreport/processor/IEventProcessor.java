package com.xiaomi.clientreport.processor;

import com.xiaomi.clientreport.data.a;
import java.util.ArrayList;
import java.util.HashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public interface IEventProcessor extends c, d {
    String bytesToString(byte[] bArr);

    void setEventMap(HashMap<String, ArrayList<a>> hashMap);

    byte[] stringToBytes(String str);
}
