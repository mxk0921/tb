package com.alibaba.wireless.security.securitybody.open;

import com.alibaba.wireless.security.open.SecException;
import com.alibaba.wireless.security.open.initialize.ISecurityGuardPlugin;
import com.alibaba.wireless.security.open.securitybody.ISecurityBodyComponent;
import java.net.URLEncoder;
import java.util.HashMap;
import tv.danmaku.ijk.media.player.TaobaoMediaPlayer;

/* renamed from: com.alibaba.wireless.security.securitybody.open.б  reason: contains not printable characters */
/* loaded from: classes.dex */
public class C0179 implements ISecurityBodyComponent {

    /* renamed from: а  reason: contains not printable characters */
    private ISecurityGuardPlugin f438;

    public C0179(ISecurityGuardPlugin iSecurityGuardPlugin) {
        init(iSecurityGuardPlugin, new Object[0]);
    }

    /* renamed from: а  reason: contains not printable characters */
    private String m257(HashMap<String, String> hashMap) {
        String str;
        StringBuilder sb = new StringBuilder();
        if (hashMap != null) {
            for (String str2 : hashMap.keySet()) {
                String str3 = m258(str2);
                if (!(str3 == null || str3.length() <= 0 || (str = m258(hashMap.get(str3))) == null)) {
                    if (sb.length() != 0) {
                        sb.append("&");
                    }
                    sb.append(str3);
                    sb.append("=");
                    sb.append(str);
                }
            }
        }
        return sb.toString();
    }

    /* renamed from: б  reason: contains not printable characters */
    private String m258(String str) {
        if (str != null) {
            try {
                return URLEncoder.encode(str, "UTF-8");
            } catch (Exception unused) {
            }
        }
        return null;
    }

    @Override // com.alibaba.wireless.security.open.securitybody.ISecurityBodyComponent
    public boolean enterRiskScene(int i, HashMap<String, Object> hashMap) throws SecException {
        return ((Boolean) this.f438.getRouter().doCommand(20110, Integer.valueOf(i), hashMap)).booleanValue();
    }

    @Override // com.alibaba.wireless.security.open.securitybody.ISecurityBodyComponent
    public String getSecurityBodyDataEx(String str, String str2, String str3, HashMap<String, String> hashMap, int i, int i2) throws SecException {
        m257(hashMap);
        return (String) this.f438.getRouter().doCommand(20102, str, str2, Integer.valueOf(i), str3, m257(hashMap), Integer.valueOf(i2));
    }

    @Override // com.alibaba.wireless.security.open.securitybody.ISecurityBodyComponent
    public String getSecurityBodyDataEx(String str, HashMap<String, String> hashMap, int i, int i2) throws SecException {
        return (String) this.f438.getRouter().doCommand(20102, null, null, Integer.valueOf(i), str, m257(hashMap), Integer.valueOf(i2));
    }

    @Override // com.alibaba.wireless.security.open.IComponent
    public int init(ISecurityGuardPlugin iSecurityGuardPlugin, Object... objArr) {
        this.f438 = iSecurityGuardPlugin;
        return 0;
    }

    @Override // com.alibaba.wireless.security.open.securitybody.ISecurityBodyComponent
    public boolean leaveRiskScene(int i) throws SecException {
        return ((Boolean) this.f438.getRouter().doCommand(TaobaoMediaPlayer.FFP_PROP_INT64_SEND_SEI, Integer.valueOf(i))).booleanValue();
    }
}
