package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class shi {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(806356485);
    }

    public static String a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("85db75b0", new Object[]{str});
        }
        if (str != null) {
            if (str.contains("flv")) {
                return "flv";
            }
            if (str.contains("artc")) {
                return "artc";
            }
            if (str.contains(ryp.FILE_TYPE_VIDEO_MP4)) {
                return ryp.FILE_TYPE_VIDEO_MP4;
            }
            if (str.contains("m3u8")) {
                return "m3u8";
            }
        }
        return "";
    }
}
