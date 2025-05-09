package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.wireless.link.pop.PopMessageData;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class agm {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public static final agm f15727a = new agm();

        static {
            t2o.a(1030750319);
        }

        public static /* synthetic */ agm a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (agm) ipChange.ipc$dispatch("fc42bc47", new Object[0]);
            }
            return f15727a;
        }
    }

    static {
        t2o.a(1030750317);
    }

    public static agm a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (agm) ipChange.ipc$dispatch("522bbd6c", new Object[0]);
        }
        return b.a();
    }

    public agm() {
    }

    public boolean b(Context context, int i, PopMessageData popMessageData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6d779d75", new Object[]{this, context, new Integer(i), popMessageData})).booleanValue();
        }
        if (popMessageData == null) {
            irg.a("link_tag", "PopMessageVerifier === verify == 消息对象为空，不显示pop");
            esg.b(esg.ARG1_POP_NOT_DATA, "", "", null);
            return false;
        } else if (!jsg.a(context)) {
            irg.a("link_tag", "PopMessageVerifier === verify == 没有悬浮窗权限，不显示pop");
            return false;
        } else if (jsg.q(context)) {
            irg.a("link_tag", "PopMessageVerifier === verify === 锁屏状态不处理消息，亮屏回到桌面再处理");
            esg.b(esg.ARG1_POP_SCREEN_LOCK, popMessageData.messageId, "", null);
            return false;
        } else if (ypg.e().d) {
            irg.a("link_tag", "PopMessageVerifier === verify == app在前台，不显示桌面push");
            esg.b(esg.ARG1_POP_IN_FRONT, popMessageData.messageId, "", null);
            return false;
        } else if (!zhm.i(context)) {
            irg.a("link_tag", "PopMessageVerifier === verify == 本地没有要展示的消息，主动发起mtop请求拉取");
            dgm.a(context, i);
            return false;
        } else if (!zhm.m(context, popMessageData)) {
            irg.a("link_tag", "PopMessageVerifier === verify == 消息体不完整");
            esg.b(esg.ARG1_POP_DATA_NOT_COMPLETE, popMessageData.messageId, "", null);
            return false;
        } else if (jsg.f() > popMessageData.expireTime) {
            irg.a("link_tag", "PopMessageVerifier === verify == 消息体过期，不显示桌面push");
            esg.b(esg.ARG1_POP_DATA_EXPIRE, popMessageData.messageId, "", null);
            return false;
        } else if (zhm.j(popMessageData)) {
            irg.a("link_tag", "PopMessageVerifier === verify == 在手淘版本黑名单，不支持桌面push");
            esg.b(esg.ARG1_POP_DATA_IN_BLACK, popMessageData.messageId, "", null);
            return false;
        } else if (zhm.l(context)) {
            return true;
        } else {
            irg.a("link_tag", "PopMessageVerifier === verify == 机型和系统版本，不支持桌面消息：" + popMessageData.messageType);
            esg.b(esg.ARG1_POP_NOT_IN_WHITELIST, popMessageData.messageId, "", null);
            return false;
        }
    }
}
