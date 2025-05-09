package com.alibaba.wireless.security.securitybody.open;

import com.alibaba.wireless.security.open.initialize.ISecurityGuardPlugin;
import com.alibaba.wireless.security.open.maldetection.IMalDetect;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public class MalDetect implements IMalDetect {

    /* renamed from: б  reason: contains not printable characters */
    private static ArrayList<IMalDetect.ICallBack> f423 = new ArrayList<>();

    /* renamed from: в  reason: contains not printable characters */
    private static Map<Integer, C0176> f424 = new HashMap();

    /* renamed from: а  reason: contains not printable characters */
    private ISecurityGuardPlugin f425;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.alibaba.wireless.security.securitybody.open.MalDetect$а  reason: contains not printable characters */
    /* loaded from: classes.dex */
    public static class C0176 {

        /* renamed from: а  reason: contains not printable characters */
        public int f426;

        /* renamed from: б  reason: contains not printable characters */
        public String f427;

        /* renamed from: в  reason: contains not printable characters */
        public String f428;
    }

    public MalDetect(ISecurityGuardPlugin iSecurityGuardPlugin) {
        init(iSecurityGuardPlugin, new Object[0]);
    }

    public static void OnDetectionJNI(int i, String str, String str2) {
        ArrayList arrayList;
        synchronized (f424) {
            if (f424.get(Integer.valueOf(i)) == null) {
                C0176 r1 = new C0176();
                r1.f426 = i;
                r1.f427 = str;
                r1.f428 = str2;
                f424.put(Integer.valueOf(i), r1);
                synchronized (f423) {
                    arrayList = (ArrayList) f423.clone();
                }
                if (arrayList != null) {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        ((IMalDetect.ICallBack) it.next()).onDetection(i, str, str2);
                    }
                }
            }
        }
    }

    /* renamed from: а  reason: contains not printable characters */
    private ArrayList<Map.Entry<Integer, C0176>> m250() {
        ArrayList<Map.Entry<Integer, C0176>> arrayList = new ArrayList<>();
        synchronized (f424) {
            for (Map.Entry<Integer, C0176> entry : f424.entrySet()) {
                arrayList.add(entry);
            }
        }
        return arrayList;
    }

    @Override // com.alibaba.wireless.security.open.IComponent
    public int init(ISecurityGuardPlugin iSecurityGuardPlugin, Object... objArr) {
        this.f425 = iSecurityGuardPlugin;
        return 0;
    }

    @Override // com.alibaba.wireless.security.open.maldetection.IMalDetect
    public void registerCallBack(IMalDetect.ICallBack iCallBack) {
        synchronized (f423) {
            if (iCallBack != null) {
                f423.add(iCallBack);
            }
        }
        if (iCallBack != null) {
            Iterator<Map.Entry<Integer, C0176>> it = m250().iterator();
            while (it.hasNext()) {
                C0176 value = it.next().getValue();
                iCallBack.onDetection(value.f426, value.f427, value.f428);
            }
        }
    }

    @Override // com.alibaba.wireless.security.open.maldetection.IMalDetect
    public void unregisterCallBack(IMalDetect.ICallBack iCallBack) {
        synchronized (f423) {
            if (iCallBack != null) {
                f423.remove(iCallBack);
            }
        }
    }
}
