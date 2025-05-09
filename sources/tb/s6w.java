package tb;

import android.media.MediaMetadataRetriever;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.mediapick.media.VideoMedia;
import com.taobao.tao.Globals;
import java.util.Map;
import java.util.concurrent.Future;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class s6w {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static boolean c = true;

    /* renamed from: a  reason: collision with root package name */
    public b f27832a;
    public Future<?> b;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private VideoMedia f27833a;
        private TextView b;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
        public class a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ String f27834a;

            public a(String str) {
                this.f27834a = str;
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                t08.sDurationCache.put(String.valueOf(b.a(b.this).id), this.f27834a);
                b.b(b.this).setText(this.f27834a);
            }
        }

        static {
            t2o.a(511705593);
        }

        public static /* synthetic */ VideoMedia a(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (VideoMedia) ipChange.ipc$dispatch("a8ceab35", new Object[]{bVar});
            }
            return bVar.f27833a;
        }

        public static /* synthetic */ TextView b(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (TextView) ipChange.ipc$dispatch("4f69fb8a", new Object[]{bVar});
            }
            return bVar.b;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (!Thread.interrupted()) {
                try {
                    if (t08.f28385a == null) {
                        t08.f28385a = new MediaMetadataRetriever();
                    }
                    t08.f28385a.setDataSource(Globals.getApplication(), this.f27833a.uri);
                    trt.h(new a(krq.h(krq.k(t08.f28385a.extractMetadata(9), 0L))));
                } catch (Exception unused) {
                }
            }
        }

        private b(VideoMedia videoMedia, TextView textView) {
            this.f27833a = videoMedia;
            this.b = textView;
        }
    }

    static {
        t2o.a(511705591);
    }

    public void a(VideoMedia videoMedia, TextView textView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b554b281", new Object[]{this, videoMedia, textView});
            return;
        }
        long j = videoMedia.duration;
        if (j > 0 || !c) {
            textView.setText(krq.h(j));
            return;
        }
        String valueOf = String.valueOf(videoMedia.id);
        Map<String, String> map = t08.sDurationCache;
        if (map.containsKey(valueOf)) {
            textView.setText(map.get(valueOf));
        } else {
            b(videoMedia, textView);
        }
    }

    public final void b(VideoMedia videoMedia, TextView textView) {
        Future<?> future;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("44d9bff3", new Object[]{this, videoMedia, textView});
            return;
        }
        if (!(this.f27832a == null || (future = this.b) == null)) {
            future.cancel(true);
            this.f27832a = null;
            this.b = null;
        }
        this.f27832a = new b(videoMedia, textView);
        try {
            this.b = t08.a().submit(this.f27832a);
        } catch (Throwable unused) {
        }
    }
}
