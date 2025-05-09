package com.taobao.android.mediapick;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.mediapick.annotation.CellView;
import com.taobao.android.mediapick.b;
import com.taobao.android.mediapick.media.Media;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import tb.a27;
import tb.sjc;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public final class MediaListAdapter extends RecyclerView.Adapter<BaseViewHolder> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final MediaPickClient f8889a;
    public sjc b;
    public b c;
    public final List<Class<? extends com.taobao.android.mediapick.a>> d = new ArrayList();
    public final List<Class<? extends Media>> e = new ArrayList();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class BaseViewHolder extends RecyclerView.ViewHolder {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final com.taobao.android.mediapick.a f8890a;

        static {
            t2o.a(519045137);
        }

        public BaseViewHolder(com.taobao.android.mediapick.a aVar) {
            super(aVar.c);
            this.f8890a = aVar;
        }

        public static /* synthetic */ Object ipc$super(BaseViewHolder baseViewHolder, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/mediapick/MediaListAdapter$BaseViewHolder");
        }

        /* JADX WARN: Type inference failed for: r0v7, types: [T extends com.taobao.android.mediapick.media.Media, java.lang.Object, com.taobao.android.mediapick.media.Media] */
        /* JADX WARN: Unknown variable types count: 1 */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void b0(int r4) {
            /*
                r3 = this;
                com.android.alibaba.ip.runtime.IpChange r0 = com.taobao.android.mediapick.MediaListAdapter.BaseViewHolder.$ipChange
                boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
                if (r1 == 0) goto L_0x001a
                java.lang.Integer r1 = new java.lang.Integer
                r1.<init>(r4)
                r4 = 2
                java.lang.Object[] r4 = new java.lang.Object[r4]
                r2 = 0
                r4[r2] = r3
                r2 = 1
                r4[r2] = r1
                java.lang.String r1 = "3bee3a35"
                r0.ipc$dispatch(r1, r4)
                return
            L_0x001a:
                com.taobao.android.mediapick.MediaListAdapter r0 = com.taobao.android.mediapick.MediaListAdapter.this
                com.taobao.android.mediapick.b r0 = com.taobao.android.mediapick.MediaListAdapter.M(r0)
                if (r0 != 0) goto L_0x0023
                return
            L_0x0023:
                com.taobao.android.mediapick.MediaListAdapter r0 = com.taobao.android.mediapick.MediaListAdapter.this
                com.taobao.android.mediapick.b r0 = com.taobao.android.mediapick.MediaListAdapter.M(r0)
                java.util.List r0 = r0.d()
                java.lang.Object r0 = r0.get(r4)
                com.taobao.android.mediapick.media.Media r0 = (com.taobao.android.mediapick.media.Media) r0
                com.taobao.android.mediapick.MediaListAdapter r1 = com.taobao.android.mediapick.MediaListAdapter.this
                com.taobao.android.mediapick.MediaPickClient r1 = com.taobao.android.mediapick.MediaListAdapter.O(r1)
                java.util.List r1 = r1.b()
                boolean r1 = r1.contains(r0)
                com.taobao.android.mediapick.a r2 = r3.f8890a
                r2.f8896a = r0
                r2.b = r4
                r2.i(r0, r1)
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                java.lang.String r1 = "bindData position="
                r0.<init>(r1)
                r0.append(r4)
                java.lang.String r4 = r0.toString()
                java.lang.String r0 = "TAGMediaListAdapter"
                tb.oph.b(r0, r4)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.mediapick.MediaListAdapter.BaseViewHolder.b0(int):void");
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a implements b.c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ b f8891a;

        public a(b bVar) {
            this.f8891a = bVar;
        }

        @Override // com.taobao.android.mediapick.b.c
        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a7e9a740", new Object[]{this});
                return;
            }
            MediaListAdapter.N(MediaListAdapter.this, this.f8891a);
            MediaListAdapter.this.notifyDataSetChanged();
        }
    }

    static {
        t2o.a(519045135);
    }

    public MediaListAdapter(MediaPickClient mediaPickClient) {
        this.f8889a = mediaPickClient;
        this.b = new a27(mediaPickClient.v());
    }

    public static /* synthetic */ b M(MediaListAdapter mediaListAdapter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("eb09f55e", new Object[]{mediaListAdapter});
        }
        return mediaListAdapter.c;
    }

    public static /* synthetic */ b N(MediaListAdapter mediaListAdapter, b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("54b6a32e", new Object[]{mediaListAdapter, bVar});
        }
        mediaListAdapter.c = bVar;
        return bVar;
    }

    public static /* synthetic */ MediaPickClient O(MediaListAdapter mediaListAdapter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MediaPickClient) ipChange.ipc$dispatch("66afee53", new Object[]{mediaListAdapter});
        }
        return mediaListAdapter.f8889a;
    }

    public static /* synthetic */ Object ipc$super(MediaListAdapter mediaListAdapter, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/mediapick/MediaListAdapter");
    }

    public b P() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("3c1e48a0", new Object[]{this});
        }
        return this.c;
    }

    public final Type[] Q(Class cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Type[]) ipChange.ipc$dispatch("53fe12c", new Object[]{this, cls});
        }
        if (cls == null) {
            return null;
        }
        Type genericSuperclass = cls.getGenericSuperclass();
        if (genericSuperclass instanceof ParameterizedType) {
            return ((ParameterizedType) genericSuperclass).getActualTypeArguments();
        }
        if (genericSuperclass instanceof Class) {
            return Q((Class) genericSuperclass);
        }
        return null;
    }

    /* renamed from: S */
    public void onBindViewHolder(BaseViewHolder baseViewHolder, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1b6c497c", new Object[]{this, baseViewHolder, new Integer(i)});
        } else {
            baseViewHolder.b0(i);
        }
    }

    /* renamed from: T */
    public BaseViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        com.taobao.android.mediapick.a aVar = null;
        if (i == -1) {
            return null;
        }
        try {
            aVar = (com.taobao.android.mediapick.a) ((Class) ((ArrayList) this.d).get(i)).newInstance();
        } catch (Throwable unused) {
        }
        aVar.f(this.f8889a, this.b, viewGroup);
        return new BaseViewHolder(aVar);
    }

    public void U(Class<? extends com.taobao.android.mediapick.a> cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cddaf811", new Object[]{this, cls});
        } else if (cls != null) {
            Type[] Q = Q(cls);
            if (Q == null || Q.length <= 0) {
                throw new RuntimeException("can't registe cellview without media type");
            }
            Class cls2 = (Class) Q[0];
            if (((ArrayList) this.e).contains(cls2)) {
                int indexOf = ((ArrayList) this.e).indexOf(cls2);
                ((ArrayList) this.d).remove(indexOf);
                ((ArrayList) this.e).remove(indexOf);
            }
            ((ArrayList) this.d).add(cls);
            ((ArrayList) this.e).add(cls2);
            V(((ArrayList) this.e).indexOf(cls2), cls);
        }
    }

    public final void V(int i, Class<? extends com.taobao.android.mediapick.a> cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b64af833", new Object[]{this, new Integer(i), cls});
            return;
        }
        CellView cellView = (CellView) cls.getAnnotation(CellView.class);
        if (cellView != null && i != -1) {
            ((RecyclerView) this.f8889a.getView()).getRecycledViewPool().setMaxRecycledViews(i, cellView.cacheSize());
        }
    }

    public void W(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dc3ed360", new Object[]{this, bVar});
            return;
        }
        bVar.m(this.f8889a.v());
        bVar.a(new a(bVar));
    }

    public void X(sjc sjcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("97d0f5ec", new Object[]{this, sjcVar});
        } else if (sjcVar != null) {
            this.b = sjcVar;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        List<? extends Media> d;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("970ddc80", new Object[]{this})).intValue();
        }
        b bVar = this.c;
        if (bVar == null || (d = bVar.d()) == null) {
            return 0;
        }
        return d.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public long getItemId(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("19b1c34c", new Object[]{this, new Integer(i)})).longValue();
        }
        return i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("65c98627", new Object[]{this, new Integer(i)})).intValue();
        }
        b bVar = this.c;
        if (bVar == null) {
            return 0;
        }
        return ((ArrayList) this.e).indexOf(((Media) bVar.d().get(i)).getClass());
    }
}
