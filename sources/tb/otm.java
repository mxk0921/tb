package tb;

import android.content.Context;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class otm {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final List<String> f25643a = new ArrayList();
    public boolean b = false;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class a implements wbd {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final String f25644a;

        static {
            t2o.a(352321877);
            t2o.a(774897702);
        }

        public a(otm otmVar, String str) {
            this.f25644a = str;
        }

        @Override // tb.wbd
        public void onFinish(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6a105f4a", new Object[]{this, new Integer(i)});
            } else {
                txj.e(txj.TAG_RENDER, "预加载视频完成videoId：".concat(this.f25644a).concat("长度:").concat(String.valueOf(i)));
            }
        }

        @Override // tb.wbd
        public void onProgress(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5ec8f5b0", new Object[]{this, new Integer(i)});
            }
        }

        @Override // tb.wbd
        public void onStart(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("938ad014", new Object[]{this, str});
            } else {
                txj.e(txj.TAG_RENDER, "开始预加载视频：".concat(str).concat(" ，videoId：").concat(this.f25644a));
            }
        }
    }

    static {
        t2o.a(352321876);
    }

    public static HashMap<String, String> a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("a88784d0", new Object[0]);
        }
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("userId", oj7.a());
        hashMap.put("playScenes", "newdetail");
        hashMap.put("from", "newdetail_native");
        hashMap.put("videoChannel", "newDetailNative");
        return hashMap;
    }

    public void b(Context context, String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b1488f7b", new Object[]{this, context, str, new Boolean(z)});
        } else if (this.b) {
            ((ArrayList) this.f25643a).add(str);
            txj.e(txj.TAG_RENDER, "当前队列里有等待预下载的视频，加到队列里：" + str);
        } else {
            e95.a(context, str, a(), 512000, new a(this, str));
            if (z) {
                this.b = true;
            }
            txj.e(txj.TAG_RENDER, "当前队列里没有等待预下载的视频，直接开始预下载：" + str);
        }
    }

    public void c(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4ad777fb", new Object[]{this, context});
            return;
        }
        Iterator it = ((ArrayList) this.f25643a).iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (!TextUtils.isEmpty(str)) {
                e95.a(context, str, a(), 512000, new a(this, str));
                txj.e(txj.TAG_RENDER, "triggerVideoPreload, videoId: " + str);
            }
        }
        ((ArrayList) this.f25643a).clear();
        this.b = false;
    }
}
