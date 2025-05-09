package com.taobao.android.mediapick;

import android.content.Context;
import android.os.AsyncTask;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.mediapick.media.Media;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import tb.esc;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public abstract class b {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int TYPE_ALL = 0;
    public static final int TYPE_IMAGE = 1;
    public static final int TYPE_VIDEO = 2;

    /* renamed from: a  reason: collision with root package name */
    public final int f8900a;
    public final List<c> b;
    public List<? extends Media> c;
    public Context d;
    public final esc e;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a implements esc {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // tb.esc
        public void a(Media media) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ddd3b889", new Object[]{this, media});
            } else {
                b.this.j(media);
            }
        }

        @Override // tb.esc
        public boolean b(Media media) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("3233fdd6", new Object[]{this, media})).booleanValue();
            }
            return b.this.i(media);
        }
    }

    /* compiled from: Taobao */
    /* renamed from: com.taobao.android.mediapick.b$b  reason: collision with other inner class name */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class AsyncTaskC0461b extends AsyncTask<Void, Void, List<? extends Media>> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public AsyncTaskC0461b() {
        }

        public static /* synthetic */ Object ipc$super(AsyncTaskC0461b bVar, String str, Object... objArr) {
            if (str.hashCode() == -1325021319) {
                super.onPostExecute(objArr[0]);
                return null;
            }
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/mediapick/BaseDataSource$2");
        }

        /* renamed from: a */
        public List<? extends Media> doInBackground(Void... voidArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (List) ipChange.ipc$dispatch("f9c7edf0", new Object[]{this, voidArr});
            }
            return b.this.h();
        }

        /* renamed from: b */
        public void onPostExecute(List<? extends Media> list) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("598ba7ce", new Object[]{this, list});
                return;
            }
            super.onPostExecute(list);
            b bVar = b.this;
            bVar.c = list;
            bVar.g();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public interface c {
        void a();
    }

    static {
        t2o.a(519045125);
    }

    public b(int i) {
        this.b = new ArrayList();
        this.c = new ArrayList();
        this.e = new a();
        this.f8900a = i;
    }

    public void a(c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("368a8cfa", new Object[]{this, cVar});
        } else if (!((ArrayList) this.b).contains(cVar)) {
            ((ArrayList) this.b).add(cVar);
        }
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b62c9e41", new Object[]{this});
        } else {
            new AsyncTaskC0461b().execute(new Void[0]);
        }
    }

    public Context c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("e1727078", new Object[]{this});
        }
        return this.d;
    }

    public List<? extends Media> d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("dbd142c0", new Object[]{this});
        }
        return this.c;
    }

    public esc e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (esc) ipChange.ipc$dispatch("fe0f4914", new Object[]{this});
        }
        return this.e;
    }

    public int f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b91b5302", new Object[]{this})).intValue();
        }
        return this.f8900a;
    }

    public void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("72676f2a", new Object[]{this});
            return;
        }
        Iterator it = ((ArrayList) this.b).iterator();
        while (it.hasNext()) {
            ((c) it.next()).a();
        }
    }

    public abstract List<? extends Media> h();

    public boolean i(Media media) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("99c558b", new Object[]{this, media})).booleanValue();
        }
        return false;
    }

    public void j(Media media) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("78f5638e", new Object[]{this, media});
        }
    }

    public void k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b5a391a0", new Object[]{this});
        } else {
            b();
        }
    }

    public void l(c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5bd6cb5d", new Object[]{this, cVar});
        } else {
            ((ArrayList) this.b).remove(cVar);
        }
    }

    public void m(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1a164154", new Object[]{this, context});
        } else {
            this.d = context;
        }
    }

    public b() {
        this(0);
    }
}
