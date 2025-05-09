package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.downloader.sync.SyncItem;
import com.taobao.orange.OrangeConfig;
import java.util.ArrayList;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class ual implements y8l {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String GROUP = "android_download_task";
    public static final String TAG = "orangeSync";
    public static ual c;

    /* renamed from: a  reason: collision with root package name */
    public List<SyncItem> f29263a;
    public Runnable b;

    public static ual a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ual) ipChange.ipc$dispatch("2d42fc12", new Object[0]);
        }
        if (c == null) {
            c = new ual();
            OrangeConfig.getInstance().registerListener(new String[]{GROUP}, c);
        }
        return c;
    }

    public List<SyncItem> b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("11c71351", new Object[]{this});
        }
        if (this.f29263a == null) {
            d();
        }
        if (this.f29263a == null) {
            return new ArrayList();
        }
        return new ArrayList(this.f29263a);
    }

    public boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6599cd22", new Object[]{this})).booleanValue();
        }
        return "true".equals(OrangeConfig.getInstance().getConfig(GROUP, "ShutDownFileSync", ""));
    }

    public void e(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bf5ef50b", new Object[]{this, runnable});
        } else {
            this.b = runnable;
        }
    }

    public final void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6a6a48ff", new Object[]{this});
            return;
        }
        String config = OrangeConfig.getInstance().getConfig(GROUP, "predownload_tasks_version", "");
        if (TextUtils.isEmpty(config)) {
            config = OrangeConfig.getInstance().getConfig(GROUP, "predownload_tasks", "");
        }
        if (TextUtils.isEmpty(config)) {
            fs7.g(TAG, "read config is null", new Object[0]);
            return;
        }
        try {
            this.f29263a = JSON.parseArray(config, SyncItem.class);
            Runnable runnable = this.b;
            if (runnable != null) {
                runnable.run();
            }
        } catch (Throwable unused) {
        }
        String config2 = OrangeConfig.getInstance().getConfig(GROUP, "boost_biz", "");
        if (!TextUtils.isEmpty(config2)) {
            xh4.o = config2;
        }
    }

    @Override // tb.y8l
    public void onConfigUpdate(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d0b193b", new Object[]{this, str});
        } else if (GROUP.equals(str)) {
            fs7.g(TAG, " on orange update listener", new Object[0]);
            d();
        }
    }
}
