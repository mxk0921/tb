package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.mytaobao.newSettingV2.data.NewGeneralSettingDataModel;
import com.taobao.tao.Globals;
import com.taobao.weex.common.Constants;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class e6a {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static Map<String, String> b;

    /* renamed from: a  reason: collision with root package name */
    public final j9t f18319a = j9t.e(Globals.getApplication(), "mytaobao");

    static {
        t2o.a(745537758);
    }

    public e6a() {
        HashMap hashMap = new HashMap();
        b = hashMap;
        hashMap.put("fontSize", r0k.KEY_FONT_SIZE);
        b.put("countryArea", "region");
        b.put("networkDiagnosis", r0k.KEY_NETWORK_DIAGNOSE);
        b.put("networkAccelerate", r0k.KEY_NETWORK_SPEEDUP);
        b.put(Constants.Name.AUTO_PLAY, "video");
        b.put("backendPlay", r0k.KEY_LIVE_BACKGROUND_PLAY);
        b.put("builtInVoice", r0k.KEY_INLINE_VOLUME);
        b.put("frequentShop", r0k.KEY_VISIT_OFTEN_SHOP);
        b.put("frequentLive", r0k.KEY_VISIT_OFTEN_LIVE);
        b.put("homepageShake", r0k.KEY_HOMEPAGE_SHAKE);
        b.put(r0k.KEY_CART_SHAKE, r0k.KEY_CART_SHAKE);
        b.put("screenShotShare", "share");
        b.put("localtionService", r0k.KEY_LOCATION_SERVICE);
        b.put("ocr", "ocr");
        b.put("accessibility", r0k.KEY_ASSISTANT);
        b.put("tbAssistant", r0k.KEY_TAOBAO_HELPER);
        b.put("notifiationBar", r0k.KEY_TMALL_NOTIFY);
        b.put("voiceAssistant", r0k.KEY_VOICE_ASSISTANT);
        b.put("wifiPreDownload", r0k.KEY_WIFI_AUTO_DOWNLOAD);
        b.put("cleanCache", r0k.KEY_CLEAN_CACHE);
    }

    public String a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ac5c1dd", new Object[]{this, str});
        }
        String str2 = (String) ((HashMap) b).get(str);
        if (TextUtils.isEmpty(str2)) {
            return str;
        }
        return str2;
    }

    public String b(String str, NewGeneralSettingDataModel newGeneralSettingDataModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f4486121", new Object[]{this, str, newGeneralSettingDataModel});
        }
        if ("video".equals(str)) {
            return r0k.g();
        }
        if (r0k.KEY_CLEAN_CACHE.equals(str)) {
            return " ";
        }
        if ("region".equals(str)) {
            return r0k.f();
        }
        return null;
    }

    public void d(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9520eb20", new Object[]{this, str, new Boolean(z)});
        } else {
            e(str, z, false);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00b9, code lost:
        if (r6.equals(tb.r0k.KEY_WIFI_AUTO_DOWNLOAD) == false) goto L_0x0023;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Boolean c(java.lang.String r6) {
        /*
            Method dump skipped, instructions count: 406
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.e6a.c(java.lang.String):java.lang.Boolean");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0090, code lost:
        if (r8.equals(tb.r0k.KEY_CART_SHAKE) == false) goto L_0x0030;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void e(java.lang.String r8, boolean r9, boolean r10) {
        /*
            Method dump skipped, instructions count: 366
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.e6a.e(java.lang.String, boolean, boolean):void");
    }
}
