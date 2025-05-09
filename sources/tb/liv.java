package tb;

import android.content.Context;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import com.taobao.taolive.sdk.model.common.VideoInfo;

/* compiled from: Taobao */
@Deprecated
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class liv {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int DIANTAO_OFFICIAL = 1;

    static {
        t2o.a(806355845);
    }

    public static int a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("47c52a85", new Object[]{context})).intValue();
        }
        return (i3s.e() - w2s.c(context, 33.0f)) - w2s.a(110.0f);
    }

    public static String c(Context context, jkd jkdVar) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("924247e6", new Object[]{context, jkdVar});
        }
        if (jkdVar instanceof st9) {
            str = ((st9) jkdVar).f28260a;
        } else {
            str = null;
        }
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        return context.getString(R.string.taolive_user_follow_account_success);
    }

    public static String d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7c09b4e2", new Object[]{str});
        }
        return s3s.b(str);
    }

    public static int e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e0010990", new Object[0])).intValue();
        }
        return i3s.e();
    }

    public static int f(Context context) {
        float f;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3b7351e9", new Object[]{context})).intValue();
        }
        int e = (int) (e() * 0.251f);
        if (xca.f31296a) {
            f = 0.0f;
        } else {
            f = 24.0f;
        }
        return e - w2s.c(context, f);
    }

    public static boolean g(VideoInfo videoInfo) {
        VideoInfo.DiantaoDisplayInfo diantaoDisplayInfo;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d03d1859", new Object[]{videoInfo})).booleanValue();
        }
        if (videoInfo == null || (diantaoDisplayInfo = videoInfo.displayInfo) == null || diantaoDisplayInfo.diantaoRoomType != 1) {
            return false;
        }
        return true;
    }

    public static boolean h(VideoInfo videoInfo) {
        VideoInfo.DiantaoOfficialAtmosphereInfo diantaoOfficialAtmosphereInfo;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9b5ac76a", new Object[]{videoInfo})).booleanValue();
        }
        if (!g(videoInfo) || (diantaoOfficialAtmosphereInfo = videoInfo.displayInfo.diantaoOfficialAtmosphereInfo) == null || TextUtils.isEmpty(diantaoOfficialAtmosphereInfo.taoLiveIcon)) {
            return false;
        }
        return true;
    }

    public static boolean i(VideoInfo videoInfo) {
        VideoInfo.TaoLiveAtmosphereInfo taoLiveAtmosphereInfo;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ded55c17", new Object[]{videoInfo})).booleanValue();
        }
        if (videoInfo == null || !j(videoInfo) || (taoLiveAtmosphereInfo = videoInfo.taoLiveAtmosphereInfo) == null || TextUtils.isEmpty(taoLiveAtmosphereInfo.taoLiveIcon)) {
            return false;
        }
        return true;
    }

    public static boolean j(VideoInfo videoInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b044c5c6", new Object[]{videoInfo})).booleanValue();
        }
        if (videoInfo == null || (videoInfo.newRoomType & 256) != 256) {
            return false;
        }
        return true;
    }
}
