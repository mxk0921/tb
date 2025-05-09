package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import tb.bmi;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final class csp extends bmi {
    public static final String ARGS_ARGS = "args";
    public static final String ARGS_NAME = "name";
    public static final String CARD_DATA_CHANGE_ARGS_ID = "id";
    public static final String CARD_DATA_CHANGE_ARGS_TYPE = "type";
    public static final String CARD_DATA_CHANGE_ARGS_TYPE_COLLECTION = "COLLECTION";
    public static final String CARD_DATA_CHANGE_ARGS_TYPE_EXT = "EXT";
    public static final String CARD_DATA_CHANGE_ARGS_TYPE_GG_GAME = "ggGame";
    public static final String CARD_DATA_CHANGE_ARGS_TYPE_LIVE = "LIVE";
    public static final String CARD_DATA_CHANGE_ARGS_TYPE_PICTURE_ALBUM = "PICTURE_ALBUM";
    public static final String CARD_DATA_CHANGE_ARGS_TYPE_VIDEO = "VIDEO";
    public static final String CARD_DATA_CHANGE_NAME = "VSMSG_activeCardDataChange";
    public static final a Companion = new a(null);
    public static final String FIRST_FRAME_RENDER_FINISH_NAME = "VSMSG_firstFrameRenderFinish";
    public static final String GET_CARD_DATA_CALLBACK_DATA = "data";
    public static final String GET_CARD_DATA_CALLBACK_DATA_ID = "id";
    public static final String GET_CARD_DATA_CALLBACK_DATA_TYPE = "type";
    public static final String GET_CARD_DATA_CALLBACK_DATA_TYPE_COLLECTION = "COLLECTION";
    public static final String GET_CARD_DATA_CALLBACK_DATA_TYPE_EXT = "EXT";
    public static final String GET_CARD_DATA_CALLBACK_DATA_TYPE_GG_GAME = "ggGame";
    public static final String GET_CARD_DATA_CALLBACK_DATA_TYPE_LIVE = "LIVE";
    public static final String GET_CARD_DATA_CALLBACK_DATA_TYPE_PICTURE_ALBUM = "PICTURE_ALBUM";
    public static final String GET_CARD_DATA_CALLBACK_DATA_TYPE_VIDEO = "VIDEO";
    public static final String GET_CARD_DATA_NAME = "VSMSG_getActiveCardData";
    public static final String PAUSE_VIDEO_NAME = "VSMSG_pauseActiveCardMedia";
    public static final String PLAY_ACTIVE_CARD_MEDIA_NAME = "VSMSG_playActiveCardMedia";
    public static final String VIDEO_STATE_CHANGE_ARGS_STATE = "state";
    public static final String VIDEO_STATE_CHANGE_ARGS_STATE_PAUSE = "pause";
    public static final String VIDEO_STATE_CHANGE_ARGS_STATE_PROGRESS_FINISH = "finished";
    public static final String VIDEO_STATE_CHANGE_ARGS_STATE_PROGRESS_UPDATE = "timeUpdate";
    public static final String VIDEO_STATE_CHANGE_ARGS_STATE_START = "play";
    public static final String VIDEO_STATE_CHANGE_NAME = "VSMSG_videoStateChanged";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(689963261);
        }

        public a() {
        }

        public final csp a(JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (csp) ipChange.ipc$dispatch("8df43f32", new Object[]{this, jSONObject});
            }
            ckf.g(jSONObject, "messageJSONObject");
            vgh.c(this, "ShortVideoTabMessage", "解析视频Tab消息实体");
            Object obj = jSONObject.get("args");
            Object obj2 = jSONObject.get("timestamp");
            Object obj3 = jSONObject.get("sender");
            Object obj4 = jSONObject.get(bmi.KEY_RECEIVER);
            if ((obj instanceof JSONObject) && (obj2 instanceof Long) && (obj3 instanceof String) && (obj4 instanceof String)) {
                return b((JSONObject) obj, ((Number) obj2).longValue(), (String) obj3, (String) obj4, null);
            }
            vgh.c(this, "ShortVideoTabMessage", "解析视频Tab消息实体，messageJSONObject参数无效");
            return null;
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public final csp b(JSONObject jSONObject, long j, String str, String str2, bmi.a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (csp) ipChange.ipc$dispatch("359a347a", new Object[]{this, jSONObject, new Long(j), str, str2, aVar});
            }
            ckf.g(jSONObject, "args");
            ckf.g(str, "sender");
            ckf.g(str2, bmi.KEY_RECEIVER);
            vgh.c(this, "ShortVideoTabMessage", "解析视频Tab消息实体，timestamp=" + j + "，sender=" + str + "，receiver=" + str2);
            if ((!ckf.b(str, "Interact") || !ckf.b(str2, "Interact")) && (ckf.b(str, "Interact") || ckf.b(str2, "Interact"))) {
                Object obj = jSONObject.get("name");
                if (!(obj instanceof String)) {
                    vgh.c(this, "ShortVideoTabMessage", "解析视频Tab消息实体，name无效");
                    return null;
                }
                if (jSONObject.get("id") == null) {
                    jSONObject.put((JSONObject) "id", "-1");
                }
                return new csp((String) obj, jSONObject, j, str, str2, aVar, null);
            }
            vgh.c(this, "ShortVideoTabMessage", "解析视频Tab消息实体，sender和receiver无效");
            return null;
        }
    }

    static {
        t2o.a(689963260);
    }

    public /* synthetic */ csp(String str, JSONObject jSONObject, long j, String str2, String str3, bmi.a aVar, a07 a07Var) {
        this(str, jSONObject, j, str2, str3, aVar);
    }

    public csp(String str, JSONObject jSONObject, long j, String str2, String str3, bmi.a aVar) {
        super(str, jSONObject, j, str2, str3, aVar);
    }
}
