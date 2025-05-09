package tb;

import android.content.Context;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.wireless.link.assistant.display.AssistantView;
import com.taobao.wireless.link.model.MessageData;
import java.util.HashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class omi extends tmi {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Context f25489a;

        public a(Context context) {
            this.f25489a = context;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                md1.h().e(this.f25489a);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public static final omi f25490a = new omi(null);

        static {
            t2o.a(1030750236);
        }

        public static /* synthetic */ omi a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (omi) ipChange.ipc$dispatch("8e556524", new Object[0]);
            }
            return f25490a;
        }
    }

    static {
        t2o.a(1030750234);
    }

    public /* synthetic */ omi(a aVar) {
        this();
    }

    public static omi c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (omi) ipChange.ipc$dispatch("f58c889f", new Object[0]);
        }
        return b.a();
    }

    public static /* synthetic */ Object ipc$super(omi omiVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/wireless/link/assistant/MessageClient");
    }

    public omi() {
    }

    @Override // tb.tmi
    public void b(Context context, MessageData messageData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d563cb07", new Object[]{this, context, messageData});
            return;
        }
        new HashMap().put(vo.KEY_MESSAGE_DATA, messageData.assistant_title);
        esg.b(esg.ARG1_ASSISTANT_GET_MESSAGE, messageData.activity_id, messageData.message_id, null);
        cno b2 = cno.b(context);
        messageData.msg_arrive_time = jsg.f();
        if (jsg.q(context)) {
            qd1.v(b2, messageData);
            qd1.u(b2, messageData);
            irg.a("link_tag", "MessageCenter === execute === 锁屏状态不处理消息，亮屏回到桌面再处理");
        } else if (TextUtils.equals(mr4.b().f24246a.assistant_type, "close")) {
            irg.a("link_tag", "MessageCenter === execute === 推送开关，关闭小助手");
            qd1.y(b2);
            qd1.x(context, b2, messageData.activity_id);
            qd1.B(context, messageData.activity_id);
            md1.h().m(context, false);
            AssistantView.updateAssistantView(0, messageData.assistant_title, messageData.assistant_pic_url);
            mr4.b().a().postDelayed(new a(context), 8000L);
        } else if (TextUtils.equals(mr4.b().f24246a.assistant_type, "msg") && qd1.b(context)) {
            qd1.v(b2, messageData);
            qd1.u(b2, messageData);
            String k = qd1.k(context);
            nd1 e = qd1.e(context, b2, k, messageData.activity_id);
            if (!TextUtils.isEmpty(messageData.assistant_logo_url)) {
                e.c = messageData.assistant_logo_url;
            }
            e.d = jsg.f();
            qd1.t(b2, messageData.activity_id, k, e);
            String str = messageData.activity_id;
            qd1.w(context, str, k, e.d + "");
            irg.a("link_tag", "MessageCenter === execute === 开始渲染小助手，清除待显示的消息");
            br7.d(context);
        }
    }
}
