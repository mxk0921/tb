package tb;

import android.content.Context;
import com.alibaba.marvel.java.OnNativeDataCallback;
import com.alibaba.marvel.toolbox.SeparateParam;
import com.alibaba.marvel.toolbox.ToolBox;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.litecreator.comprehension.a;
import java.io.File;
import java.nio.ByteBuffer;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class i9w {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final int CODE_SUCCESS = 0;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a implements OnNativeDataCallback {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ b f21180a;
        public final /* synthetic */ String b;

        /* compiled from: Taobao */
        /* renamed from: tb.i9w$a$a  reason: collision with other inner class name */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
        public class RunnableC0943a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public RunnableC0943a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                a aVar = a.this;
                ((a.C0435a) aVar.f21180a).b(aVar.b);
            }
        }

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
        public class b implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ int f21182a;

            public b(int i) {
                this.f21182a = i;
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    ((a.C0435a) a.this.f21180a).a(String.valueOf(this.f21182a), "size <= 0 ");
                }
            }
        }

        public a(i9w i9wVar, b bVar, String str) {
            this.f21180a = bVar;
            this.b = str;
        }

        public void onEnd(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("91e6a60", new Object[]{this, new Integer(i)});
            } else if (i == 0) {
                try {
                    trt.h(new RunnableC0943a());
                } catch (Exception e) {
                    e.printStackTrace();
                }
            } else {
                trt.h(new b(i));
            }
        }

        public boolean onFrame(ByteBuffer byteBuffer, long j, long j2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("2371b1a0", new Object[]{this, byteBuffer, new Long(j), new Long(j2)})).booleanValue();
            }
            return true;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public interface b {
    }

    static {
        t2o.a(511705211);
    }

    public static String a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e7e01f", new Object[]{str});
        }
        byte[] o = cg9.o(new File(str));
        if (o == null || o.length <= 0) {
            return "";
        }
        return new String(cq1.c(o));
    }

    public void b(Context context, String str, b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9ef2b8d6", new Object[]{this, context, str, bVar});
            return;
        }
        SeparateParam separateParam = new SeparateParam(str);
        String j = i8g.j(context, ".aac");
        separateParam.output = j;
        separateParam.startTimeUs = 10L;
        separateParam.sampleRate = 16000;
        separateParam.channelCount = 1;
        separateParam.endTimeUs = 6000000L;
        ToolBox.separateAudio(separateParam, new a(this, bVar, j));
    }
}
