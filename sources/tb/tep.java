package tb;

import android.content.Intent;
import com.android.alibaba.ip.runtime.IpChange;
import org.json.JSONArray;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class tep {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String KEY_BIND_STATE = "bindState";
    public static final String KEY_DATA_TYPE = "type";
    public static final String KEY_DURATION_MS = "duration_ms";
    public static final String KEY_IMAGE_PATH = "IMAGE_PATH";
    public static final String KEY_LAUNCH_URI = "launchUri";
    public static final String KEY_TP_RETURN_DURATION_S = "duration";
    public static final String KEY_TP_RETURN_FILE_SOURCE_TYPE = "fileSource";
    public static final String KEY_TP_RETURN_MISSION_ID = "missionId";
    public static final String KEY_TP_RETURN_VIDEO_COVER_CDN_URL = "coverUrl";
    public static final String KEY_TP_RETURN_VIDEO_COVER_PATH = "videoCoverPath";
    public static final String KEY_TP_RETURN_VIDEO_FILE_ID = "fileId";
    public static final String KEY_TP_RETURN_VIDEO_FILE_URL = "fileURL";
    public static final String KEY_TP_RETURN_VIDEO_HEIGHT = "height";
    public static final String KEY_TP_RETURN_VIDEO_MSG = "message";
    public static final String KEY_TP_RETURN_VIDEO_VIDEO_ID = "videoId";
    public static final String KEY_TP_RETURN_VIDEO_WIDTH = "width";
    public static final String KEY_UNIFORM_RESULT = "elements";
    public static final String MESSAGE_FAILURE = "publish error";

    static {
        t2o.a(623902753);
    }

    public static void b(nsw nswVar, Intent intent, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1f5e2490", new Object[]{nswVar, intent, str});
            return;
        }
        try {
            nswVar.c(str, new JSONArray(intent.getStringExtra(str)));
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public static void c(nsw nswVar, Intent intent, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1e50266", new Object[]{nswVar, intent, str});
        } else {
            nswVar.b(str, intent.getStringExtra(str));
        }
    }

    public static void a(Intent intent, nsw nswVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("68423193", new Object[]{intent, nswVar});
            return;
        }
        nswVar.b(KEY_TP_RETURN_VIDEO_FILE_ID, intent.getStringExtra(KEY_TP_RETURN_VIDEO_FILE_ID));
        nswVar.b(KEY_TP_RETURN_VIDEO_FILE_URL, intent.getStringExtra(KEY_TP_RETURN_VIDEO_FILE_URL));
        nswVar.b("videoId", intent.getStringExtra("videoId"));
        nswVar.a("height", Integer.valueOf(intent.getIntExtra("height", 0)));
        nswVar.a("width", Integer.valueOf(intent.getIntExtra("width", 0)));
        nswVar.a("duration", Integer.valueOf(intent.getIntExtra("duration", 0)));
        nswVar.a(KEY_DURATION_MS, Integer.valueOf(intent.getIntExtra(KEY_DURATION_MS, 0)));
        nswVar.b("message", intent.getStringExtra("message"));
        c(nswVar, intent, KEY_LAUNCH_URI);
        c(nswVar, intent, "missionId");
        c(nswVar, intent, KEY_TP_RETURN_FILE_SOURCE_TYPE);
        c(nswVar, intent, KEY_BIND_STATE);
        c(nswVar, intent, KEY_IMAGE_PATH);
        b(nswVar, intent, KEY_UNIFORM_RESULT);
        c(nswVar, intent, KEY_TP_RETURN_VIDEO_COVER_PATH);
        c(nswVar, intent, KEY_TP_RETURN_VIDEO_COVER_CDN_URL);
        c(nswVar, intent, "type");
    }
}
