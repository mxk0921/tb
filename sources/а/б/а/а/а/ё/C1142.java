package а.б.а.а.а.ё;

import com.alibaba.wireless.security.open.SecException;
import com.alibaba.wireless.security.open.initialize.ISecurityGuardPlugin;
import com.alibaba.wireless.security.securitybody.ApmSecurityBodyPluginAdapter;
import com.taobao.wireless.security.sdk.securitybody.ISecurityBodyComponent;
import tv.danmaku.ijk.media.player.TaobaoMediaPlayer;

/* renamed from: а.б.а.а.а.ё.б  reason: contains not printable characters */
/* loaded from: classes.dex */
public class C1142 implements ISecurityBodyComponent {

    /* renamed from: а  reason: contains not printable characters */
    private ISecurityGuardPlugin f1747;

    /* renamed from: б  reason: contains not printable characters */
    private com.alibaba.wireless.security.open.securitybody.ISecurityBodyComponent f1748;

    public C1142(ISecurityGuardPlugin iSecurityGuardPlugin) {
        this.f1747 = iSecurityGuardPlugin;
        if (iSecurityGuardPlugin != null) {
            this.f1748 = (com.alibaba.wireless.security.open.securitybody.ISecurityBodyComponent) iSecurityGuardPlugin.getInterface(com.alibaba.wireless.security.open.securitybody.ISecurityBodyComponent.class);
        }
    }

    @Override // com.taobao.wireless.security.sdk.securitybody.ISecurityBodyComponent
    public String getSecurityBodyData(String str) {
        return getSecurityBodyDataEx(str, null, 0);
    }

    @Override // com.taobao.wireless.security.sdk.securitybody.ISecurityBodyComponent
    public String getSecurityBodyData(String str, String str2) {
        return getSecurityBodyDataEx(str, str2, 0);
    }

    @Override // com.taobao.wireless.security.sdk.securitybody.ISecurityBodyComponent
    public String getSecurityBodyDataEx(String str, String str2, int i) {
        ApmSecurityBodyPluginAdapter.monitorStart("getSecurityBodyDataEx");
        try {
            String securityBodyDataEx = this.f1748.getSecurityBodyDataEx(str, str2, "", null, i, 3);
            ApmSecurityBodyPluginAdapter.monitorEnd("getSecurityBodyDataEx");
            return securityBodyDataEx;
        } catch (SecException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override // com.taobao.wireless.security.sdk.securitybody.ISecurityBodyComponent
    public boolean initSecurityBody(String str) {
        if (str == null) {
            return false;
        }
        return ((Boolean) this.f1747.getRouter().doCommand(TaobaoMediaPlayer.FFP_PROP_INT64_HEVC_DECODE_OPT, str, this.f1747.getContext().getPackageName())).booleanValue();
    }

    @Override // com.taobao.wireless.security.sdk.securitybody.ISecurityBodyComponent
    public boolean putUserActionRecord(String str, String str2, float f, float f2) {
        if (str == null || str2 == null) {
            return false;
        }
        return ((Boolean) this.f1747.getRouter().doCommand(20104, str, str2, Float.valueOf(f), Float.valueOf(f2))).booleanValue();
    }

    @Override // com.taobao.wireless.security.sdk.securitybody.ISecurityBodyComponent
    public boolean putUserTrackRecord(String str) {
        if (str == null) {
            return false;
        }
        return ((Boolean) this.f1747.getRouter().doCommand(20103, str)).booleanValue();
    }

    @Override // com.taobao.wireless.security.sdk.securitybody.ISecurityBodyComponent
    public void setSecurityBodyServer(int i) {
        this.f1747.getRouter().doCommand(20105, Integer.valueOf(i));
    }
}
