package com.alibaba.wireless.security.open.middletier.fc;

import android.content.Context;
import com.alibaba.wireless.security.framework.InterfacePluginInfo;
import com.alibaba.wireless.security.open.IComponent;
import com.alibaba.wireless.security.open.SecException;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;

/* compiled from: Taobao */
@InterfacePluginInfo(pluginName = "middletier")
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public interface IFCComponent extends IComponent {
    public static final String KEY_BX_SLEEP = "bx-sleep";
    public static final String KEY_LOGIN_MODULE = "key_login_module";
    public static final String KEY_RESEND_DATA = "key-resend-data";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public enum ResponseHeaderType {
        KVO,
        KVL;
        
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(ResponseHeaderType responseHeaderType, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/wireless/security/open/middletier/fc/IFCComponent$ResponseHeaderType");
        }

        public static ResponseHeaderType valueOf(String str) {
            Object valueOf;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                valueOf = ipChange.ipc$dispatch("9f0b1ad7", new Object[]{str});
            } else {
                valueOf = Enum.valueOf(ResponseHeaderType.class, str);
            }
            return (ResponseHeaderType) valueOf;
        }
    }

    String getFCPluginVersion() throws SecException;

    boolean needFCProcessOrNot(int i, HashMap hashMap, ResponseHeaderType responseHeaderType) throws SecException;

    boolean needFCProcessOrNotV2(int i, String str) throws SecException;

    void processFCContent(int i, HashMap hashMap, IFCActionCallback iFCActionCallback, ResponseHeaderType responseHeaderType) throws SecException;

    void processFCContentV2(String str, IFCActionCallback iFCActionCallback) throws SecException;

    void setUp(Context context, HashMap hashMap) throws SecException;
}
