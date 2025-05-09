package com.taobao.android.remoteso.component;

import android.content.Context;
import androidx.core.util.Pair;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import tb.gcf;
import tb.j0n;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class d {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final a f9256a;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public Context b;
        public boolean c;
        public j0n e;
        public gcf f;

        /* renamed from: a  reason: collision with root package name */
        public final List<Pair<String, List<String>>> f9257a = new ArrayList();
        public boolean d = false;

        public a a(String str, String... strArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("1c283694", new Object[]{this, str, strArr});
            }
            ((ArrayList) this.f9257a).add(Pair.create(str, Arrays.asList(strArr)));
            return this;
        }

        public d b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (d) ipChange.ipc$dispatch("173d2738", new Object[]{this});
            }
            return new d(this);
        }

        public a c(gcf gcfVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("6b6171a7", new Object[]{this, gcfVar});
            }
            this.f = gcfVar;
            return this;
        }

        public a d(Context context) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("3e538444", new Object[]{this, context});
            }
            this.b = context;
            return this;
        }

        public a e(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("4b5c8814", new Object[]{this, new Boolean(z)});
            }
            this.d = z;
            return this;
        }

        public a f(j0n j0nVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("7d3bbcbc", new Object[]{this, j0nVar});
            }
            this.e = j0nVar;
            return this;
        }

        public a g(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("f36980ca", new Object[]{this, new Boolean(z)});
            }
            this.c = z;
            return this;
        }

        public String toString() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
            }
            return "Builder{modules=" + this.f9257a + ", showUI=" + this.c + ", ignoreRemoErrorView=false, loadingViewCreator=null}";
        }
    }

    public d(a aVar) {
        this.f9256a = aVar;
    }

    public static a a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("238ff0ee", new Object[0]);
        }
        return new a();
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "RemoRequest{builder=" + this.f9256a + '}';
    }
}
