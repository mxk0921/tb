package tb;

import android.os.Handler;
import com.alibaba.android.split.SplitFileInfo;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public interface l0c<Param> {

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public interface a<Param> {

        /* compiled from: Taobao */
        /* renamed from: tb.l0c$a$a  reason: collision with other inner class name */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
        public interface AbstractC0976a {
        }

        void a(int i, Param param, AbstractC0976a aVar);

        void onDownloadError(String str, int i, String str2);

        void onDownloadFinish(String str, String str2);

        void onDownloadProgress(int i);

        void onDownloadStateChange(String str, boolean z);

        void onFinish(boolean z);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public interface b<Param> extends a<Param> {
        void b(String str, Map<String, String> map);
    }

    Param a();

    int b(List<SplitFileInfo> list, Param param, Executor executor, Handler handler, b<Param> bVar);

    void c(int i);

    void d(int i);
}
