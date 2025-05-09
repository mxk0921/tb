package com.taobao.android.tbuprofen;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import tb.asr;
import tb.osd;
import tb.rrr;
import tb.t2o;
import tb.trr;
import tb.urr;
import tb.zrr;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class TBPEngineNative {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(822083590);
    }

    public native int getVersionNative();

    public native int loadPluginNative(String str, String str2);

    public native int monitorEventNative(int i, boolean z);

    public native int nativeDestroy();

    public native int nativeInit(int i, int i2);

    public native int unLoadPluginNative(String str);

    public boolean a(rrr rrrVar) {
        int nativeInit;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("258f0e75", new Object[]{this, rrrVar})).booleanValue();
        }
        try {
            String loadLibrary = zrr.c().loadLibrary(trr.ENGINE_LIB_NAME);
            if (!TextUtils.isEmpty(loadLibrary)) {
                rrrVar.d.b(osd.ERR_LOAD_ENGINE_EXCEPTION, loadLibrary);
                urr.b("TBPEngineNative", "Failed to load tbp-engine. %s", loadLibrary);
                return false;
            }
            try {
                nativeInit = nativeInit(rrrVar.e, rrrVar.c.ordinal());
            } catch (Exception e) {
                rrrVar.d.b(osd.ERR_INIT_ENGINE_EXCEPTION, asr.c(e));
                urr.c("TBPEngineNative", e, "Failed to init engine", new Object[0]);
            }
            if (!asr.a(nativeInit)) {
                rrrVar.d.b(osd.ERR_INIT_ENGINE, String.valueOf(nativeInit));
                return false;
            }
            int versionNative = getVersionNative();
            String b = asr.b(versionNative);
            if (!(versionNative == 805372417 || versionNative == 1879114240)) {
                urr.b("TBPEngineNative", "The tbp ver is invalid: %s", b);
                rrrVar.d.b(osd.ERR_ENGINE_VER, b);
                return false;
            }
            urr.d("TBPEngineNative", "Init tbp engine successfully with ver: %s", b);
            return true;
        } catch (Exception e2) {
            rrrVar.d.b(osd.ERR_LOAD_ENGINE_EXCEPTION, asr.c(e2));
            urr.c("TBPEngineNative", e2, "Failed to load tbp-engine", new Object[0]);
            return false;
        }
    }
}
