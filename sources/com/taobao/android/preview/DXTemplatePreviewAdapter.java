package com.taobao.android.preview;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXResult;
import com.taobao.android.dinamicx.DXRootView;
import com.taobao.android.dinamicx.s;
import com.taobao.android.dinamicx.template.download.DXTemplateItem;
import java.util.HashMap;
import tb.eb5;
import tb.h36;
import tb.t2o;
import tb.xv5;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class DXTemplatePreviewAdapter extends RecyclerView.Adapter<PreviewViewHolder> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public JSONArray f9188a;
    public final RecyclerView b;
    public final s c;
    public final Context d;
    public int e = 0;
    public final HashMap<Integer, Integer> f = new HashMap<>();
    public final HashMap<String, Integer> g = new HashMap<>(128);
    public final HashMap<Integer, DXTemplateItem> h = new HashMap<>(128);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class a extends DXRootView.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ DXRootView f9189a;

        public a(DXRootView dXRootView) {
            this.f9189a = dXRootView;
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/preview/DXTemplatePreviewAdapter$1");
        }

        @Override // com.taobao.android.dinamicx.DXRootView.a
        public void d(DXRootView dXRootView) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b0378a16", new Object[]{this, dXRootView});
            } else {
                DXTemplatePreviewAdapter.this.c.k().t0(dXRootView);
            }
        }

        @Override // com.taobao.android.dinamicx.DXRootView.a
        public void f(DXRootView dXRootView) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8ba36c13", new Object[]{this, dXRootView});
            } else {
                DXTemplatePreviewAdapter.this.c.k().u0(dXRootView);
            }
        }

        @Override // com.taobao.android.dinamicx.DXRootView.a
        public void k(View view, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("14c8819b", new Object[]{this, view, new Integer(i)});
            } else if (i == 0) {
                DXTemplatePreviewAdapter.this.c.k().t0(this.f9189a);
            } else {
                DXTemplatePreviewAdapter.this.c.k().u0(this.f9189a);
            }
        }

        @Override // com.taobao.android.dinamicx.DXRootView.a
        public void m(DXRootView dXRootView, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("67771788", new Object[]{this, dXRootView, new Integer(i)});
            } else if (i == 0) {
                DXTemplatePreviewAdapter.this.c.k().t0(dXRootView);
            } else {
                DXTemplatePreviewAdapter.this.c.k().u0(dXRootView);
            }
        }
    }

    static {
        t2o.a(444598044);
    }

    public DXTemplatePreviewAdapter(Context context, JSONArray jSONArray, RecyclerView recyclerView, s sVar) {
        JSONArray jSONArray2 = new JSONArray();
        this.f9188a = jSONArray2;
        jSONArray2.addAll(jSONArray);
        this.c = sVar;
        this.b = recyclerView;
        this.d = context;
        M();
    }

    public static View O(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("7bc574c7", new Object[]{context});
        }
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, 0));
        return frameLayout;
    }

    public static /* synthetic */ Object ipc$super(DXTemplatePreviewAdapter dXTemplatePreviewAdapter, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/preview/DXTemplatePreviewAdapter");
    }

    public boolean N() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ec62e310", new Object[]{this})).booleanValue();
        }
        this.g.clear();
        return true;
    }

    public final boolean P(DXTemplateItem dXTemplateItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("28eaf495", new Object[]{this, dXTemplateItem})).booleanValue();
        }
        if (dXTemplateItem == null) {
            return false;
        }
        if (dXTemplateItem.c() == 30000) {
            return true;
        }
        if (dXTemplateItem.c() == 20000) {
            return false;
        }
        if (!TextUtils.isEmpty(dXTemplateItem.c) && (dXTemplateItem.c.endsWith(".zip") || dXTemplateItem.c.endsWith("._dxv4") || dXTemplateItem.c.contains("._dxv4") || dXTemplateItem.c.contains(".zip"))) {
            return true;
        }
        if (!TextUtils.isEmpty(dXTemplateItem.c) || dXTemplateItem.b < 0) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x009b  */
    /* renamed from: S */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.taobao.android.preview.PreviewViewHolder onCreateViewHolder(android.view.ViewGroup r6, int r7) {
        /*
            r5 = this;
            r0 = 0
            com.android.alibaba.ip.runtime.IpChange r1 = com.taobao.android.preview.DXTemplatePreviewAdapter.$ipChange
            boolean r2 = r1 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r2 == 0) goto L_0x0020
            java.lang.Integer r2 = new java.lang.Integer
            r2.<init>(r7)
            r7 = 3
            java.lang.Object[] r7 = new java.lang.Object[r7]
            r7[r0] = r5
            r0 = 1
            r7[r0] = r6
            r6 = 2
            r7[r6] = r2
            java.lang.String r6 = "a0a94e55"
            java.lang.Object r6 = r1.ipc$dispatch(r6, r7)
            com.taobao.android.preview.PreviewViewHolder r6 = (com.taobao.android.preview.PreviewViewHolder) r6
            return r6
        L_0x0020:
            r1 = -1
            r2 = 0
            if (r7 != r1) goto L_0x002d
            android.content.Context r7 = r6.getContext()
            android.view.View r7 = O(r7)
            goto L_0x006c
        L_0x002d:
            java.util.HashMap<java.lang.Integer, com.taobao.android.dinamicx.template.download.DXTemplateItem> r1 = r5.h
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            java.lang.Object r7 = r1.get(r7)
            com.taobao.android.dinamicx.template.download.DXTemplateItem r7 = (com.taobao.android.dinamicx.template.download.DXTemplateItem) r7
            if (r7 == 0) goto L_0x006b
            boolean r1 = tb.eb5.A()     // Catch: Exception -> 0x0060
            r7.g = r1     // Catch: Exception -> 0x0060
            com.taobao.android.dinamicx.s r1 = r5.c     // Catch: Exception -> 0x0060
            android.content.Context r3 = r5.d     // Catch: Exception -> 0x0060
            com.taobao.android.dinamicx.DXResult r1 = r1.g(r3, r6, r7)     // Catch: Exception -> 0x0060
            if (r1 == 0) goto L_0x006b
            T r1 = r1.f7291a     // Catch: Exception -> 0x0060
            if (r1 == 0) goto L_0x006b
            android.view.View r1 = (android.view.View) r1     // Catch: Exception -> 0x0060
            boolean r7 = r5.P(r7)     // Catch: Exception -> 0x005e
            if (r7 == 0) goto L_0x0069
            r7 = r1
            com.taobao.android.dinamicx.DXRootView r7 = (com.taobao.android.dinamicx.DXRootView) r7     // Catch: Exception -> 0x005e
            r5.T(r7)     // Catch: Exception -> 0x005e
            goto L_0x0069
        L_0x005e:
            r7 = move-exception
            goto L_0x0062
        L_0x0060:
            r7 = move-exception
            r1 = r2
        L_0x0062:
            java.lang.String r3 = "DXTemplatePreviewActivity"
            java.lang.String r4 = "createViewHolder failed"
            android.util.Log.e(r3, r4, r7)
        L_0x0069:
            r7 = r1
            goto L_0x006c
        L_0x006b:
            r7 = r2
        L_0x006c:
            if (r7 != 0) goto L_0x0083
            android.content.Context r7 = r6.getContext()
            android.view.View r7 = O(r7)
            android.content.Context r6 = r6.getContext()
            java.lang.String r1 = "Preview template failed"
            android.widget.Toast r6 = android.widget.Toast.makeText(r6, r1, r0)
            r6.show()
        L_0x0083:
            com.taobao.android.preview.PreviewViewHolder r6 = new com.taobao.android.preview.PreviewViewHolder
            r6.<init>(r7, r2)
            android.view.View r7 = r6.itemView
            android.view.ViewGroup$LayoutParams r7 = r7.getLayoutParams()
            if (r7 == 0) goto L_0x009b
            androidx.recyclerview.widget.RecyclerView r0 = r5.b
            androidx.recyclerview.widget.RecyclerView$LayoutManager r0 = r0.getLayoutManager()
            androidx.recyclerview.widget.RecyclerView$LayoutParams r7 = r0.generateLayoutParams(r7)
            goto L_0x00a5
        L_0x009b:
            androidx.recyclerview.widget.RecyclerView r7 = r5.b
            androidx.recyclerview.widget.RecyclerView$LayoutManager r7 = r7.getLayoutManager()
            androidx.recyclerview.widget.RecyclerView$LayoutParams r7 = r7.generateDefaultLayoutParams()
        L_0x00a5:
            android.view.View r0 = r6.itemView
            r0.setLayoutParams(r7)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.preview.DXTemplatePreviewAdapter.onCreateViewHolder(android.view.ViewGroup, int):com.taobao.android.preview.PreviewViewHolder");
    }

    public final void T(DXRootView dXRootView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1058e91b", new Object[]{this, dXRootView});
        } else {
            this.c.k().U0(dXRootView, new a(dXRootView));
        }
    }

    public void U(JSONArray jSONArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("55894442", new Object[]{this, jSONArray});
            return;
        }
        JSONArray jSONArray2 = this.f9188a;
        if (jSONArray2 != null) {
            jSONArray2.clear();
            this.f9188a.addAll(jSONArray);
        } else {
            JSONArray jSONArray3 = new JSONArray();
            this.f9188a = jSONArray3;
            jSONArray3.addAll(jSONArray);
        }
        M();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("970ddc80", new Object[]{this})).intValue();
        }
        JSONArray jSONArray = this.f9188a;
        if (jSONArray != null) {
            return jSONArray.size();
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("65c98627", new Object[]{this, new Integer(i)})).intValue();
        }
        Integer num = this.f.get(Integer.valueOf(i));
        if (num != null) {
            return num.intValue();
        }
        return -1;
    }

    public final void M() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f121d38d", new Object[]{this});
            return;
        }
        for (int i = 0; i < this.f9188a.size(); i++) {
            DXTemplateItem dXTemplateItem = new DXTemplateItem();
            JSONObject jSONObject = (JSONObject) this.f9188a.getJSONObject(i).get("template");
            if (jSONObject != null) {
                dXTemplateItem.b = Long.parseLong(jSONObject.getString("version"));
                dXTemplateItem.f7343a = jSONObject.getString("name");
                dXTemplateItem.c = jSONObject.getString("url");
                String d = dXTemplateItem.d();
                if (this.g.containsKey(d)) {
                    this.f.put(Integer.valueOf(i), this.g.get(d));
                } else {
                    DXTemplateItem i2 = this.c.i(dXTemplateItem);
                    if (i2 == null) {
                        this.f.put(Integer.valueOf(i), -1);
                    } else {
                        String d2 = i2.d();
                        if (this.g.containsKey(d2)) {
                            this.f.put(Integer.valueOf(i), this.g.get(d2));
                        } else {
                            this.e++;
                            i2.g = eb5.A();
                            this.g.put(d2, Integer.valueOf(this.e));
                            this.h.put(Integer.valueOf(this.e), i2);
                            this.f.put(Integer.valueOf(i), Integer.valueOf(this.e));
                        }
                    }
                }
            }
        }
    }

    /* renamed from: Q */
    public void onBindViewHolder(PreviewViewHolder previewViewHolder, int i) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3bc865f", new Object[]{this, previewViewHolder, new Integer(i)});
        } else if (getItemViewType(i) != -1) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.putAll((JSONObject) this.f9188a.get(i));
                DXResult<DXRootView> v = this.c.v(this.d, jSONObject, (DXRootView) previewViewHolder.itemView, 0, 0, null);
                if (v != null && v.d()) {
                    Log.e(h36.TAG, v.a().c.toString());
                }
            } catch (Exception e) {
                xv5.b(e);
            }
            StaggeredGridLayoutManager.LayoutParams layoutParams = (StaggeredGridLayoutManager.LayoutParams) previewViewHolder.itemView.getLayoutParams();
            String string = this.f9188a.getJSONObject(i).getJSONObject("template").getString("columnType");
            if (!TextUtils.equals(string, "one") && !TextUtils.isEmpty(string)) {
                z = false;
            }
            layoutParams.setFullSpan(z);
        }
    }
}
