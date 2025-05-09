package com.alibaba.wireless.security.open.securityguardaccsadapter.usertrack;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import tb.g2v;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class UserTrackPlugin extends g2v {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final boolean DEBUG = false;
    private static final String TAG = "UserTrackPlugin";
    private final IUserTrackPlugin mUserTrackPlugin;

    static {
        t2o.a(658505743);
    }

    public UserTrackPlugin(IUserTrackPlugin iUserTrackPlugin) {
        this.mUserTrackPlugin = iUserTrackPlugin;
    }

    public static /* synthetic */ Object ipc$super(UserTrackPlugin userTrackPlugin, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/wireless/security/open/securityguardaccsadapter/usertrack/UserTrackPlugin");
    }

    @Override // tb.g2v
    public int[] getAttentionEventIds() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (int[]) ipChange.ipc$dispatch("873e4cb7", new Object[]{this});
        }
        return this.mUserTrackPlugin.getAttentionEventIds();
    }

    @Override // tb.g2v
    public String getPluginName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("fd12a725", new Object[]{this});
        }
        return this.mUserTrackPlugin.getPluginName();
    }

    @Override // tb.g2v
    public Map<String, String> onEventDispatch(String str, int i, String str2, String str3, String str4) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("63572670", new Object[]{this, str, new Integer(i), str2, str3, str4}) : this.mUserTrackPlugin.onEventDispatch(str, i, str2, str3, str4);
    }

    @Override // tb.g2v
    public Map<String, String> onEventDispatch(String str, int i, String str2, String str3, String str4, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("84d56f5f", new Object[]{this, str, new Integer(i), str2, str3, str4, map}) : this.mUserTrackPlugin.onEventDispatchExt(str, i, str2, str3, str4, map);
    }
}
