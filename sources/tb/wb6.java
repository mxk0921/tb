package tb;

import android.os.Looper;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import com.taobao.aranger.annotation.method.UIThread;
import com.taobao.message.lab.comfrm.util.ExtentionFunctionKt;
import com.taobao.tao.log.TLog;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class wb6 extends ob5 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);

    /* renamed from: a  reason: collision with root package name */
    public final float f30581a = 0.5f;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* compiled from: Taobao */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ltb/xhv;", "run", "()V", "<anonymous>"}, k = 3, mv = {1, 4, 0})
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
        public static final class b implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ RecyclerView f30583a;
            public final /* synthetic */ float b;
            public final /* synthetic */ JSONArray c;
            public final /* synthetic */ boolean d;

            public b(RecyclerView recyclerView, float f, JSONArray jSONArray, boolean z) {
                this.f30583a = recyclerView;
                this.b = f;
                this.c = jSONArray;
                this.d = z;
            }

            @Override // java.lang.Runnable
            public final void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                List<RecyclerView.ViewHolder> findVisibleViewHolderList = ExtentionFunctionKt.findVisibleViewHolderList(this.f30583a);
                ArrayList arrayList = new ArrayList();
                for (RecyclerView.ViewHolder viewHolder : findVisibleViewHolderList) {
                    View view = viewHolder.itemView;
                    ckf.c(view, "itemVH.itemView");
                    int max = Math.max(view.getLeft(), this.f30583a.getLeft());
                    View view2 = viewHolder.itemView;
                    ckf.c(view2, "itemVH.itemView");
                    int min = Math.min(view2.getRight(), this.f30583a.getRight());
                    int adapterPosition = viewHolder.getAdapterPosition();
                    View view3 = viewHolder.itemView;
                    ckf.c(view3, "itemVH.itemView");
                    if (min - max > view3.getWidth() * this.b) {
                        arrayList.add(Integer.valueOf(adapterPosition));
                    }
                }
                if (!arrayList.isEmpty()) {
                    a.a(wb6.Companion, arrayList, this.c, this.d);
                }
            }
        }

        static {
            t2o.a(745537956);
        }

        public a() {
        }

        public static final /* synthetic */ void a(a aVar, List list, JSONArray jSONArray, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3f7acaad", new Object[]{aVar, list, jSONArray, new Boolean(z)});
            } else {
                aVar.b(list, jSONArray, z);
            }
        }

        public final void b(List<Integer> list, JSONArray jSONArray, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("610b03e6", new Object[]{this, list, jSONArray, new Boolean(z)});
            } else {
                p3j.g(new RunnableC1084a(list, jSONArray, z));
            }
        }

        @JvmStatic
        public final JSONArray c(JSONObject jSONObject, boolean z) {
            JSONObject jSONObject2;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (JSONArray) ipChange.ipc$dispatch("9ebbd336", new Object[]{this, jSONObject, new Boolean(z)});
            }
            JSONArray jSONArray = null;
            if (z) {
                if (jSONObject != null) {
                    JSONObject jSONObject3 = jSONObject.getJSONObject("events");
                    if (jSONObject3 != null) {
                        jSONArray = jSONObject3.getJSONArray("scrollExposeItem");
                    }
                }
                return jSONArray;
            }
            if (jSONObject != null) {
                JSONObject jSONObject4 = jSONObject.getJSONObject("events");
                if (!(jSONObject4 == null || (jSONObject2 = jSONObject4.getJSONObject("itemExposeUt")) == null)) {
                    jSONArray = jSONObject2.getJSONArray("scrollExposeItem");
                }
            }
            return jSONArray;
            return jSONArray;
        }

        @JvmStatic
        @UIThread
        public final void d(RecyclerView recyclerView, JSONArray jSONArray, float f, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c27110d2", new Object[]{this, recyclerView, jSONArray, new Float(f), new Boolean(z)});
                return;
            }
            ckf.h(recyclerView, "rv");
            ckf.h(jSONArray, "utDataList");
            b bVar = new b(recyclerView, f, jSONArray, z);
            if (recyclerView.isAttachedToWindow()) {
                bVar.run();
            } else {
                recyclerView.post(bVar);
            }
        }

        /* compiled from: Taobao */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ltb/xhv;", "run", "()V", "<anonymous>"}, k = 3, mv = {1, 4, 0})
        /* renamed from: tb.wb6$a$a  reason: collision with other inner class name */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
        public static final class RunnableC1084a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ List f30582a;
            public final /* synthetic */ JSONArray b;
            public final /* synthetic */ boolean c;

            public RunnableC1084a(List list, JSONArray jSONArray, boolean z) {
                this.f30582a = list;
                this.b = jSONArray;
                this.c = z;
            }

            @Override // java.lang.Runnable
            public final void run() {
                String string;
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                try {
                    TLog.loge("DXScrollPercentExposeEH", "needExposeIndexList=" + JSON.toJSONString(this.f30582a));
                    int size = this.f30582a.size();
                    for (int i = 0; i < size; i++) {
                        JSONArray jSONArray = this.b.getJSONArray(((Number) this.f30582a.get(i)).intValue());
                        if (jSONArray != null) {
                            int size2 = jSONArray.size();
                            for (int i2 = 0; i2 < size2; i2++) {
                                JSONObject jSONObject = jSONArray.getJSONObject(i2);
                                if (!(jSONObject == null || (string = jSONObject.getString("arg1")) == null)) {
                                    JSONObject jSONObject2 = jSONObject.getJSONObject("args");
                                    if (this.c && jSONObject2 != null) {
                                        jSONObject2.put("mtCommitTime", (Object) Long.valueOf(System.currentTimeMillis()));
                                    }
                                    Integer integer = jSONObject.getInteger("eventId");
                                    int intValue = integer != null ? integer.intValue() : 2201;
                                    String string2 = jSONObject.getString("page");
                                    if (string2 == null) {
                                        string2 = u3j.b;
                                    }
                                    r4v.a(string2, intValue, string, null, null, jSONObject2);
                                }
                            }
                        }
                    }
                } catch (Throwable unused) {
                }
            }
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }
    }

    static {
        t2o.a(745537955);
    }

    @JvmStatic
    public static final JSONArray a(JSONObject jSONObject, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONArray) ipChange.ipc$dispatch("9ebbd336", new Object[]{jSONObject, new Boolean(z)});
        }
        return Companion.c(jSONObject, z);
    }

    @JvmStatic
    @UIThread
    public static final void b(RecyclerView recyclerView, JSONArray jSONArray, float f, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c27110d2", new Object[]{recyclerView, jSONArray, new Float(f), new Boolean(z)});
        } else {
            Companion.d(recyclerView, jSONArray, f, z);
        }
    }

    public static /* synthetic */ Object ipc$super(wb6 wb6Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/mytaobao/pagev2/eventhandler/ability/DXScrollPercentExposeEventHandler");
    }

    @Override // tb.ob5, tb.mvb
    public void handleEvent(DXEvent dXEvent, Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        Object obj;
        View view;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9db7b67", new Object[]{this, dXEvent, objArr, dXRuntimeContext});
        } else if (ckf.b(Looper.getMainLooper(), Looper.myLooper())) {
            RecyclerView recyclerView = null;
            if (objArr != null) {
                obj = ic1.L(objArr, 1);
            } else {
                obj = null;
            }
            if (!(obj instanceof JSONArray)) {
                obj = null;
            }
            JSONArray jSONArray = (JSONArray) obj;
            if (jSONArray != null) {
                if (dXRuntimeContext != null) {
                    view = dXRuntimeContext.D();
                } else {
                    view = null;
                }
                if (view instanceof RecyclerView) {
                    recyclerView = view;
                }
                RecyclerView recyclerView2 = recyclerView;
                if (recyclerView2 != null) {
                    Companion.d(recyclerView2, jSONArray, this.f30581a, false);
                }
            }
        }
    }
}
