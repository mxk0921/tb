package com.taobao.wireless.security.adapter.datacollection;

import com.alibaba.wireless.security.open.initialize.ISecurityGuardPlugin;
import com.taobao.wireless.security.adapter.common.SPUtility2;
import com.taobao.wireless.security.adapter.datareport.DataReportJniBridge;

/* renamed from: com.taobao.wireless.security.adapter.datacollection.а  reason: contains not printable characters */
/* loaded from: classes.dex */
public class C0811 {

    /* renamed from: б  reason: contains not printable characters */
    private static final String f585 = "DataCollectionData";

    /* renamed from: в  reason: contains not printable characters */
    private static final String f586 = "key_nick";

    /* renamed from: г  reason: contains not printable characters */
    private static final Object f587 = new Object();

    /* renamed from: д  reason: contains not printable characters */
    private static final Object f588 = new Object();

    /* renamed from: е  reason: contains not printable characters */
    private static volatile C0811 f589;

    /* renamed from: а  reason: contains not printable characters */
    private ISecurityGuardPlugin f590;

    private C0811(ISecurityGuardPlugin iSecurityGuardPlugin) {
        this.f590 = iSecurityGuardPlugin;
        DeviceInfoCapturer.initialize(iSecurityGuardPlugin, this);
        DataReportJniBridge.initialize(iSecurityGuardPlugin.getContext());
    }

    /* renamed from: а  reason: contains not printable characters */
    public static C0811 m365(ISecurityGuardPlugin iSecurityGuardPlugin) {
        if (f589 == null) {
            synchronized (C0811.class) {
                if (f589 == null) {
                    f589 = new C0811(iSecurityGuardPlugin);
                }
            }
        }
        return f589;
    }

    /* renamed from: г  reason: contains not printable characters */
    private String m366() {
        return "unknown";
    }

    /* renamed from: д  reason: contains not printable characters */
    private String m367() {
        try {
            return (String) Class.forName("com.taobao.login4android.Login").getMethod("getNick", new Class[0]).invoke(null, new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: ж  reason: contains not printable characters */
    private void m368(int i) {
        this.f590.getRouter().doCommand(10901, Integer.valueOf(i));
    }

    /* renamed from: б  reason: contains not printable characters */
    public String m369() {
        return m370(0);
    }

    /* renamed from: в  reason: contains not printable characters */
    public String m370(int i) {
        String str;
        synchronized (f587) {
            str = null;
            try {
                if ((i & 64) != 0) {
                    str = m366();
                } else if (i == 0) {
                    str = m367();
                }
                if (str == null || str.length() == 0) {
                    String str2 = f586;
                    if (i != 0) {
                        str2 = str2 + "_" + i;
                    }
                    str = SPUtility2.readFromSPUnified(f585, str2, "");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return str;
    }

    /* renamed from: е  reason: contains not printable characters */
    public boolean m371(String str) {
        return m372(0, str);
    }

    /* renamed from: ё  reason: contains not printable characters */
    public boolean m372(int i, String str) {
        boolean z;
        String str2 = m370(i);
        synchronized (f587) {
            if (str == null) {
                str = "";
            }
            String str3 = f586;
            if (i != 0) {
                str3 = str3 + "_" + i;
            }
            z = !str.equals(str2) && SPUtility2.saveToSPUnified(f585, str3, str, true);
        }
        if (!z) {
            return false;
        }
        m368(i);
        return true;
    }
}
