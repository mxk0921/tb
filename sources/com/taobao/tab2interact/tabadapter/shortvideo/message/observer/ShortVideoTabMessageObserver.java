package com.taobao.tab2interact.tabadapter.shortvideo.message.observer;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import tb.a07;
import tb.bmi;
import tb.ckf;
import tb.csp;
import tb.t2o;
import tb.vaj;
import tb.vgh;
import tb.wx1;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class ShortVideoTabMessageObserver extends wx1 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public enum ContentType {
        VIDEO,
        LIVE,
        PICTURE_ALBUM,
        GG_GAME,
        COLLECTION,
        EXT;
        
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(ContentType contentType, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tab2interact/tabadapter/shortvideo/message/observer/ShortVideoTabMessageObserver$ContentType");
        }

        public static ContentType valueOf(String str) {
            Object valueOf;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                valueOf = ipChange.ipc$dispatch("a86ac047", new Object[]{str});
            } else {
                valueOf = Enum.valueOf(ContentType.class, str);
            }
            return (ContentType) valueOf;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public enum VideoState {
        START,
        PAUSE,
        PROGRESS_UPDATE,
        PROGRESS_FINISH;
        
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(VideoState videoState, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tab2interact/tabadapter/shortvideo/message/observer/ShortVideoTabMessageObserver$VideoState");
        }

        public static VideoState valueOf(String str) {
            Object valueOf;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                valueOf = ipChange.ipc$dispatch("7bcb0146", new Object[]{str});
            } else {
                valueOf = Enum.valueOf(VideoState.class, str);
            }
            return (VideoState) valueOf;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static final class a {
        static {
            t2o.a(689963266);
        }

        public a() {
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }
    }

    static {
        t2o.a(689963265);
    }

    public static /* synthetic */ Object ipc$super(ShortVideoTabMessageObserver shortVideoTabMessageObserver, String str, Object... objArr) {
        if (str.hashCode() == 1380888358) {
            super.o((bmi) objArr[0]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tab2interact/tabadapter/shortvideo/message/observer/ShortVideoTabMessageObserver");
    }

    public final void F(bmi bmiVar) {
        ContentType contentType;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("edb6e6f0", new Object[]{this, bmiVar});
            return;
        }
        JSONObject a2 = bmiVar.a();
        if (a2 != null) {
            Object obj = a2.get("args");
            if (!(obj instanceof Map)) {
                vgh.c(this, "ShortVideoMessageObserver", "处理当前Active卡片的数据发生改变的消息，innerArgs无效");
                return;
            }
            Map map = (Map) obj;
            Object obj2 = map.get("id");
            if (!(obj2 instanceof String) || ((CharSequence) obj2).length() == 0) {
                vgh.c(this, "ShortVideoMessageObserver", "处理当前Active卡片的数据发生改变的消息，id无效");
                return;
            }
            Object obj3 = map.get("type");
            if (ckf.b(obj3, "VIDEO")) {
                contentType = ContentType.VIDEO;
            } else if (ckf.b(obj3, "LIVE")) {
                contentType = ContentType.LIVE;
            } else if (ckf.b(obj3, "PICTURE_ALBUM")) {
                contentType = ContentType.PICTURE_ALBUM;
            } else if (ckf.b(obj3, "ggGame")) {
                contentType = ContentType.GG_GAME;
            } else if (ckf.b(obj3, "COLLECTION")) {
                contentType = ContentType.COLLECTION;
            } else if (ckf.b(obj3, "EXT")) {
                contentType = ContentType.EXT;
            } else {
                vgh.c(this, "ShortVideoMessageObserver", "处理当前Active卡片的数据发生改变的消息，type无效");
                return;
            }
            I((String) obj2, contentType, bmiVar.e());
        }
    }

    public final void G(bmi bmiVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("af393bcc", new Object[]{this, bmiVar});
        } else {
            J(bmiVar.e());
        }
    }

    public final void H(bmi bmiVar) {
        VideoState videoState;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("83deceec", new Object[]{this, bmiVar});
            return;
        }
        JSONObject a2 = bmiVar.a();
        if (a2 != null) {
            Object obj = a2.get("args");
            if (!(obj instanceof Map)) {
                vgh.c(this, "ShortVideoMessageObserver", "处理卡片的视频状态发生改变的消息，innerArgs无效");
                return;
            }
            Object obj2 = ((Map) obj).get("state");
            if (ckf.b(obj2, "play")) {
                videoState = VideoState.START;
            } else if (ckf.b(obj2, "pause")) {
                videoState = VideoState.PAUSE;
            } else if (ckf.b(obj2, csp.VIDEO_STATE_CHANGE_ARGS_STATE_PROGRESS_UPDATE)) {
                videoState = VideoState.PROGRESS_UPDATE;
            } else if (ckf.b(obj2, "finished")) {
                videoState = VideoState.PROGRESS_FINISH;
            } else {
                vgh.c(this, "ShortVideoMessageObserver", "处理卡片的视频状态发生改变的消息，state无效");
                return;
            }
            K(videoState, bmiVar.e());
        }
    }

    public void I(String str, ContentType contentType, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3f9502bc", new Object[]{this, str, contentType, str2});
            return;
        }
        ckf.g(str, "contentId");
        ckf.g(contentType, "contentType");
        ckf.g(str2, vaj.KEY_TAB_ID);
        vgh.c(this, "ShortVideoMessageObserver", "当前Active卡片的数据发生改变的时机，contentId=" + str + "，contentType=" + contentType + "，tabId=" + str2);
    }

    public void J(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("93e946b5", new Object[]{this, str});
            return;
        }
        ckf.g(str, vaj.KEY_TAB_ID);
        vgh.c(this, "ShortVideoMessageObserver", "首卡首帧渲染完成的时机，tabId=".concat(str));
    }

    public void K(VideoState videoState, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f91b8cb9", new Object[]{this, videoState, str});
            return;
        }
        ckf.g(videoState, "videoState");
        ckf.g(str, vaj.KEY_TAB_ID);
        vgh.c(this, "ShortVideoMessageObserver", "卡片的视频状态发生改变的时机，videoState=" + videoState + "，tabId=" + str);
    }

    @Override // tb.wx1, tb.wa
    public void o(bmi bmiVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("524eaf26", new Object[]{this, bmiVar});
            return;
        }
        ckf.g(bmiVar, "message");
        super.o(bmiVar);
        String c = bmiVar.c();
        int hashCode = c.hashCode();
        if (hashCode != -1543801311) {
            if (hashCode != -319898197) {
                if (hashCode == -30145277 && c.equals(csp.VIDEO_STATE_CHANGE_NAME)) {
                    H(bmiVar);
                    return;
                }
            } else if (c.equals(csp.CARD_DATA_CHANGE_NAME)) {
                F(bmiVar);
                return;
            }
        } else if (c.equals(csp.FIRST_FRAME_RENDER_FINISH_NAME)) {
            G(bmiVar);
            return;
        }
        vgh.c(this, "ShortVideoMessageObserver", "收到其他消息，message=" + bmiVar);
    }
}
