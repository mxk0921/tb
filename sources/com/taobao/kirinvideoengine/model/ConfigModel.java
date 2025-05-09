package com.taobao.kirinvideoengine.model;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class ConfigModel implements Serializable {
    public final int downlaodRetryTime;
    public final int downloadConnectTimeout;
    public final int downloadReadTimeout;
    public final boolean enableBitrateDecide;
    public final boolean enablePreDownload;
    public final boolean enablePrepareToFirstFrame;
    public boolean enableVideoTBPlayer;
    public final boolean forbidPreDownload;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public boolean f10884a;
        public boolean b;
        public final int c = -1;
        public final int d = -1;
        public final int e = -1;
        public boolean f;

        static {
            t2o.a(500170787);
        }

        public static /* synthetic */ boolean a(a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("b6b8b41b", new Object[]{aVar})).booleanValue();
            }
            return aVar.f10884a;
        }

        public static /* synthetic */ boolean b(a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("7dc49b1c", new Object[]{aVar})).booleanValue();
            }
            return aVar.b;
        }

        public static /* synthetic */ int c(a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("44d0820c", new Object[]{aVar})).intValue();
            }
            return aVar.c;
        }

        public static /* synthetic */ int d(a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("bdc690d", new Object[]{aVar})).intValue();
            }
            return aVar.d;
        }

        public static /* synthetic */ int e(a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("d2e8500e", new Object[]{aVar})).intValue();
            }
            return aVar.e;
        }

        public static /* synthetic */ boolean f(a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("99f43720", new Object[]{aVar})).booleanValue();
            }
            aVar.getClass();
            return false;
        }

        public static /* synthetic */ boolean g(a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("61001e21", new Object[]{aVar})).booleanValue();
            }
            return aVar.f;
        }

        public static /* synthetic */ boolean h(a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("280c0522", new Object[]{aVar})).booleanValue();
            }
            aVar.getClass();
            return false;
        }

        public ConfigModel i() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ConfigModel) ipChange.ipc$dispatch("e4bde4fd", new Object[]{this});
            }
            return new ConfigModel(this);
        }

        public a j(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("216a821b", new Object[]{this, new Boolean(z)});
            }
            this.b = z;
            return this;
        }

        public a k(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("f99d93f1", new Object[]{this, new Boolean(z)});
            }
            this.f10884a = z;
            return this;
        }

        public a l(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("dc357190", new Object[]{this, new Boolean(z)});
            }
            this.f = z;
            return this;
        }
    }

    static {
        t2o.a(500170786);
    }

    public ConfigModel(a aVar) {
        this.enablePreDownload = a.a(aVar);
        this.enableBitrateDecide = a.b(aVar);
        this.downloadConnectTimeout = a.c(aVar);
        this.downloadReadTimeout = a.d(aVar);
        this.downlaodRetryTime = a.e(aVar);
        this.enablePrepareToFirstFrame = a.f(aVar);
        this.enableVideoTBPlayer = a.g(aVar);
        this.forbidPreDownload = a.h(aVar);
    }
}
