package tb;

import android.view.MotionEvent;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.page.ITMSPage;
import tb.z5d;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public interface s8c extends z5d {

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(843055249);
        }

        public static void a(s8c s8cVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ba12ae3d", new Object[]{s8cVar});
                return;
            }
            ckf.g(s8cVar, "this");
            z5d.a.a(s8cVar);
        }

        public static void b(s8c s8cVar, ITMSPage iTMSPage) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c225df7", new Object[]{s8cVar, iTMSPage});
                return;
            }
            ckf.g(s8cVar, "this");
            ckf.g(iTMSPage, "page");
            z5d.a.b(s8cVar, iTMSPage);
        }

        public static void c(s8c s8cVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2ec1d485", new Object[]{s8cVar});
                return;
            }
            ckf.g(s8cVar, "this");
            z5d.a.c(s8cVar);
        }
    }

    void I0();

    void d0(String str, String str2);

    void destroy();

    boolean dispatchTouchEvent(MotionEvent motionEvent);

    void f0(String str);

    void j0();

    void p(String str, JSONObject jSONObject, boolean z);

    void p0(byte[] bArr, String str, String str2);
}
