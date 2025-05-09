package com.taobao.themis.kernel.ability.base;

import android.app.Activity;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.page.ITMSPage;
import tb.bbs;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class ApiContext {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Activity f13561a;
    public final Source b;
    public final bbs c;
    public final ITMSPage d;
    public final boolean e;
    public final boolean f;
    public final String g;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public enum Source {
        INSTANCE,
        PLUGIN,
        FRAMEWORK;
        
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(Source source, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/themis/kernel/ability/base/ApiContext$Source");
        }

        public static Source valueOf(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Source) ipChange.ipc$dispatch("68e6a99d", new Object[]{str});
            }
            return (Source) Enum.valueOf(Source.class, str);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public Activity f13562a;
        public Source b;
        public ITMSPage c;
        public String e;
        public boolean d = true;
        public boolean f = false;

        static {
            t2o.a(839909425);
        }

        public ApiContext a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ApiContext) ipChange.ipc$dispatch("5a5c5fbe", new Object[]{this});
            }
            return new ApiContext(this);
        }

        public a b(Activity activity) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("c7e1db72", new Object[]{this, activity});
            }
            this.f13562a = activity;
            return this;
        }

        public a c(ITMSPage iTMSPage) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("16b70a1", new Object[]{this, iTMSPage});
            }
            this.c = iTMSPage;
            return this;
        }

        public a d(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("4ddffe56", new Object[]{this, new Boolean(z)});
            }
            this.d = z;
            return this;
        }

        public a e(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("53c84022", new Object[]{this, new Boolean(z)});
            }
            this.f = z;
            return this;
        }

        public a f(Source source) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("2e50830c", new Object[]{this, source});
            }
            this.b = source;
            return this;
        }

        public a g(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("a20e4f6d", new Object[]{this, str});
            }
            this.e = str;
            return this;
        }
    }

    static {
        t2o.a(839909424);
    }

    public ApiContext(a aVar) {
        this.f13561a = aVar.f13562a;
        this.b = aVar.b;
        ITMSPage iTMSPage = aVar.c;
        this.d = iTMSPage;
        if (iTMSPage != null) {
            this.c = iTMSPage.getInstance();
        } else {
            this.c = null;
        }
        this.e = aVar.d;
        this.g = aVar.e;
        this.f = aVar.f;
    }

    public Activity a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Activity) ipChange.ipc$dispatch("81223f9c", new Object[]{this});
        }
        return this.f13561a;
    }

    public bbs b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (bbs) ipChange.ipc$dispatch("60499308", new Object[]{this});
        }
        return this.c;
    }

    public ITMSPage c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ITMSPage) ipChange.ipc$dispatch("93aa9add", new Object[]{this});
        }
        return this.d;
    }

    public Source d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Source) ipChange.ipc$dispatch("9bb72ffc", new Object[]{this});
        }
        return this.b;
    }

    public String e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9afc202f", new Object[]{this});
        }
        return this.g;
    }

    public boolean f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a320f3da", new Object[]{this})).booleanValue();
        }
        return this.e;
    }

    public boolean g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9af4c2a6", new Object[]{this})).booleanValue();
        }
        return this.f;
    }
}
