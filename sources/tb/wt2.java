package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.codetrack.sdk.assets.AssetsDelegate;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.ref.WeakReference;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class wt2 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class a extends Thread {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public WeakReference<Context> f30908a;
        public WeakReference<String> b;

        static {
            t2o.a(295699243);
        }

        public a(Context context, String str) {
            super("live_gl_cache_template");
            this.f30908a = new WeakReference<>(context);
            this.b = new WeakReference<>(str);
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            if (str.hashCode() == 1548812690) {
                super.run();
                return null;
            }
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/live/plugin/atype/flexalocal/good/utils/CacheUtils$CacheSetTemplateThread");
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            super.run();
            WeakReference<Context> weakReference = this.f30908a;
            if (weakReference != null && this.b != null && weakReference.get() != null) {
                try {
                    rg9.b(this.f30908a.get().getCacheDir().getPath(), "template_list.json", this.b.get());
                } catch (Exception e) {
                    hha.b("CacheUtils", "CacheSetTemplateThread Run Error: " + e.getMessage());
                }
            }
        }
    }

    static {
        t2o.a(295699242);
    }

    public static String a(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ecf1d140", new Object[]{context, str});
        }
        try {
            InputStream proxy_open = AssetsDelegate.proxy_open(context.getResources().getAssets(), str);
            InputStreamReader inputStreamReader = new InputStreamReader(proxy_open, "UTF-8");
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
            StringBuilder sb = new StringBuilder();
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine != null) {
                    sb.append(readLine + "\n");
                } else {
                    bufferedReader.close();
                    inputStreamReader.close();
                    proxy_open.close();
                    hha.c("CacheUtils", "getAssetString | name=" + str);
                    return sb.toString();
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            hha.b("CacheUtils", "getAssetString | name=" + str + "error:" + e.toString());
            return "";
        }
    }

    public static String b(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("12309191", new Object[]{context});
        }
        try {
            return rg9.a(context.getCacheDir().getPath(), "template_list.json");
        } catch (Exception e) {
            hha.b("CacheUtils", "getTemplateCache Error: " + e.getMessage());
            return null;
        }
    }

    public static void c(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("435c5e05", new Object[]{context, str});
            return;
        }
        try {
            new a(context, str).start();
        } catch (Exception e) {
            hha.b("CacheUtils", "setTemplateCache Error: " + e.getMessage());
        }
    }
}
