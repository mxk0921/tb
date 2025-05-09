package com.taobao.android.nanocompose.resource_loader;

import android.app.Application;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.homepage.pop.utils.PopConst;
import java.io.File;
import kotlin.text.Regex;
import tb.a07;
import tb.ckf;
import tb.njg;
import tb.t2o;
import tb.tsq;
import tb.w6z;
import tb.wh6;
import tb.yh6;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class FilePathProviderImp implements w6z {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);
    public static volatile FilePathProviderImp d;

    /* renamed from: a  reason: collision with root package name */
    public final Application f9020a;
    public final njg b;
    public final njg c;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(598737178);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public final FilePathProviderImp a(Application application) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (FilePathProviderImp) ipChange.ipc$dispatch("b624dccd", new Object[]{this, application});
            }
            ckf.g(application, "context");
            FilePathProviderImp g = FilePathProviderImp.g();
            if (g == null) {
                synchronized (this) {
                    g = FilePathProviderImp.g();
                    if (g == null) {
                        g = new FilePathProviderImp(application, null);
                        FilePathProviderImp.h(g);
                    }
                }
            }
            return g;
        }

        public a() {
        }
    }

    static {
        t2o.a(598737177);
        t2o.a(598737175);
    }

    public /* synthetic */ FilePathProviderImp(Application application, a07 a07Var) {
        this(application);
    }

    public static final /* synthetic */ Application f(FilePathProviderImp filePathProviderImp) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Application) ipChange.ipc$dispatch("cfaaf27f", new Object[]{filePathProviderImp});
        }
        return filePathProviderImp.f9020a;
    }

    public static final /* synthetic */ FilePathProviderImp g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FilePathProviderImp) ipChange.ipc$dispatch("f58fcc6d", new Object[0]);
        }
        return d;
    }

    public static final /* synthetic */ void h(FilePathProviderImp filePathProviderImp) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a148dac5", new Object[]{filePathProviderImp});
        } else {
            d = filePathProviderImp;
        }
    }

    @Override // tb.w6z
    public String a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8bbde05d", new Object[]{this, str, str2});
        }
        ckf.g(str, PopConst.BRIDGE_KEY_BUSINESS_ID);
        ckf.g(str2, yh6.CONFIG_KEY_TEMPLATE_NAME);
        return i(str) + wh6.DIR + str2;
    }

    @Override // tb.w6z
    public String b(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("61d49943", new Object[]{this, str, str2});
        }
        ckf.g(str, PopConst.BRIDGE_KEY_BUSINESS_ID);
        ckf.g(str2, yh6.CONFIG_KEY_TEMPLATE_NAME);
        String absolutePath = new File(k(str), str2).getAbsolutePath();
        ckf.f(absolutePath, "File(getCachedRootDir(businessID), templateName).absolutePath");
        return absolutePath;
    }

    @Override // tb.w6z
    public String c(String str, String str2, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("151eea3f", new Object[]{this, str, str2, new Long(j)});
        }
        ckf.g(str, PopConst.BRIDGE_KEY_BUSINESS_ID);
        ckf.g(str2, yh6.CONFIG_KEY_TEMPLATE_NAME);
        return i(str) + wh6.DIR + str2 + wh6.DIR + j;
    }

    @Override // tb.w6z
    public String d(String str, String str2, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3fd5c08a", new Object[]{this, str, str2, new Long(j)});
        }
        ckf.g(str, PopConst.BRIDGE_KEY_BUSINESS_ID);
        ckf.g(str2, yh6.CONFIG_KEY_TEMPLATE_NAME);
        String k = k(str);
        String absolutePath = new File(k, str2 + wh6.DIR + j).getAbsolutePath();
        ckf.f(absolutePath, "File(getCachedRootDir(businessID), \"$templateName/$version\").absolutePath");
        return absolutePath;
    }

    @Override // tb.w6z
    public String e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2b7247ca", new Object[]{this, str});
        }
        ckf.g(str, "url");
        return ((Object) l()) + "/nano/tmpUnzip/" + tsq.E(str, "/", "", false, 4, null);
    }

    public String i(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b5a1f8f1", new Object[]{this, str});
        }
        ckf.g(str, PopConst.BRIDGE_KEY_BUSINESS_ID);
        return ckf.p("nano/", str);
    }

    public String j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("521b67d3", new Object[]{this});
        }
        Object value = this.b.getValue();
        ckf.f(value, "<get-cacheDirPath>(...)");
        return (String) value;
    }

    public String k(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ca9c9dbc", new Object[]{this, str});
        }
        ckf.g(str, PopConst.BRIDGE_KEY_BUSINESS_ID);
        return j() + "/nano/" + str;
    }

    public String l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e4f83551", new Object[]{this});
        }
        return (String) this.c.getValue();
    }

    public FilePathProviderImp(Application application) {
        this.f9020a = application;
        this.b = kotlin.a.b(new FilePathProviderImp$cacheDirPath$2(this));
        this.c = kotlin.a.b(new FilePathProviderImp$tempDirPath$2(this));
        new Regex("https?://([^/]+)/([^/]+)(?:\\.[^/]+)?");
    }
}
