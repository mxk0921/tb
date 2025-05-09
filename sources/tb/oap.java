package tb;

import android.content.Context;
import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class oap {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final String f25262a = "SendMessage";

    static {
        t2o.a(767557679);
    }

    public static void a(Context context, p5o p5oVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("25dc236d", new Object[]{context, p5oVar});
        } else {
            b(context, p5oVar, Boolean.FALSE);
        }
    }

    public static void b(Context context, p5o p5oVar, Boolean bool) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c3fb12c0", new Object[]{context, p5oVar, bool});
            return;
        }
        j5s.j().s().b(b6s.e, p5oVar.b, "[SendMessage] 开始发送消息");
        api apiVar = new api();
        apiVar.f15918a = context;
        apiVar.b = p5oVar.f25893a;
        j5s.j().f();
        j5s.j().p();
        j5s.q();
        a6s.a().c();
        nqi l = j5s.j().l();
        if (l != null) {
            if (bool.booleanValue()) {
                l.a(apiVar);
            } else {
                l.c(apiVar);
            }
            if (!bool.booleanValue()) {
                Log.e(f25262a, "send request message error,result is null ");
                return;
            }
            return;
        }
        Log.e(f25262a, "send request message error,you need impl message sender ");
        j5s.j().s().c(b6s.f, "SEND MESSAGE", "发送消息失败，因为没有实现消息服务");
    }
}
