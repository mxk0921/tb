package com.flybird;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.text.TextUtils;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.alipay.android.app.template.FBResourceClient;
import com.alipay.android.app.template.LogCatLog;
import com.alipay.birdnest.api.BirdNestEngine;
import com.alipay.birdnest.api.FBOverView;
import com.alipay.birdnest.util.FBLogger;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.flybird.APPullRefreshView;
import com.flybird.FBListView;
import com.flybird.view.APDefaultPullRefreshOverView;
import com.taobao.taobao.R;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;
import org.json.JSONArray;
import org.json.JSONObject;
import tb.c4o;
import tb.pg1;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class FBTable extends FBView implements FBListView.FBListViewDragListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public APPullRefreshView A;
    public FBListView C;
    public View D;
    public View E;
    public Item F;
    public int G;
    public String J;
    public AutoScrollMoreListAdapter M;
    public boolean B = false;
    public final List<Item> H = new LinkedList();
    public final HashMap<Pair<Integer, Integer>, Integer> I = new HashMap<>();
    public HashMap<View, FBDocument> K = new HashMap<>();
    public HashMap<String, Integer> L = new HashMap<>();
    public boolean N = false;
    public boolean O = false;
    public boolean P = false;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class Item {

        /* renamed from: a  reason: collision with root package name */
        public JSONObject f4967a;
        public int b;
        public int c;

        public Item(JSONObject jSONObject, int i, int i2) {
            this.f4967a = jSONObject;
            this.b = i;
            this.c = i2;
        }
    }

    public FBTable(final Context context, FBDocument fBDocument) {
        super(context, new APPullRefreshView(context), fBDocument);
        APPullRefreshView aPPullRefreshView = (APPullRefreshView) this.mView;
        this.A = aPPullRefreshView;
        FBListView fBListView = new FBListView(context);
        this.C = fBListView;
        aPPullRefreshView.addView(fBListView);
        this.C.setFBListViewDragListener(this);
        this.A.setRefreshListener(new APPullRefreshView.RefreshListener() { // from class: com.flybird.FBTable.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.flybird.APPullRefreshView.RefreshListener
            public boolean canRefresh() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return ((Boolean) ipChange.ipc$dispatch("176657f6", new Object[]{this})).booleanValue();
                }
                return true;
            }

            @Override // com.flybird.APPullRefreshView.RefreshListener
            public FBOverView getOverView() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (FBOverView) ipChange.ipc$dispatch("c58eb87e", new Object[]{this});
                }
                APDefaultPullRefreshOverView aPDefaultPullRefreshOverView = (APDefaultPullRefreshOverView) LayoutInflater.from(context).inflate(R.layout.ap_framework_pullrefresh_overview, (ViewGroup) null);
                int parseColor = Color.parseColor("#efeff4");
                aPDefaultPullRefreshOverView.setBackgroundColor(parseColor);
                View findViewById = aPDefaultPullRefreshOverView.findViewById(R.id.framework_pullrefresh_shadow_loading);
                if (findViewById != null) {
                    findViewById.setBackgroundColor(parseColor);
                }
                View findViewById2 = aPDefaultPullRefreshOverView.findViewById(R.id.framework_pullrefresh_shadow_normal);
                if (findViewById2 != null) {
                    findViewById2.setBackgroundColor(parseColor);
                }
                return aPDefaultPullRefreshOverView;
            }

            @Override // com.flybird.APPullRefreshView.RefreshListener
            public void onRefresh() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("c9cbba83", new Object[]{this});
                    return;
                }
                FBTable fBTable = FBTable.this;
                if (!fBTable.O) {
                    fBTable.A.b();
                    return;
                }
                APPullRefreshView aPPullRefreshView2 = fBTable.A;
                aPPullRefreshView2.f4890a = (byte) 5;
                aPPullRefreshView2.e.onLoad();
                aPPullRefreshView2.e.setState((byte) 3);
                aPPullRefreshView2.requestLayout();
                FBTable.this.A.postDelayed(new Runnable() { // from class: com.flybird.FBTable.1.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                            return;
                        }
                        FBView.nativePlatformOnRefresh(FBTable.this.mNode);
                        FBTable.this.A.b();
                    }
                }, 800L);
            }
        });
        this.A.setEnablePull(false);
        this.C.setDivider(new ColorDrawable(0));
        this.C.setDividerHeight(0);
    }

    public static /* synthetic */ boolean a(FBTable fBTable, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7e3d4020", new Object[]{fBTable, new Boolean(z)})).booleanValue();
        }
        fBTable.B = z;
        return z;
    }

    public static /* synthetic */ Object ipc$super(FBTable fBTable, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1022301035) {
            super.updateCSS((String) objArr[0], (String) objArr[1]);
            return null;
        } else if (hashCode == 1244158581) {
            super.updateAttr((String) objArr[0], (String) objArr[1]);
            return null;
        } else if (hashCode == 1852014070) {
            super.doDestroy();
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/flybird/FBTable");
        }
    }

    public static native String nativeNodeToJson(long j);

    public static native boolean nativePlatformOnMoveRow(long j, int i, int i2, int i3);

    @Override // com.flybird.FBView
    public void doDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6e637df6", new Object[]{this});
            return;
        }
        AutoScrollMoreListAdapter autoScrollMoreListAdapter = this.M;
        if (autoScrollMoreListAdapter != null) {
            autoScrollMoreListAdapter.clearData();
        }
        super.doDestroy();
    }

    @Override // com.flybird.FBListView.FBListViewDragListener
    public void onDragViewDown(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c667e1e2", new Object[]{this, new Integer(i)});
        } else if (this.F != null) {
            long j = this.mNode;
            Item item = this.F;
            nativePlatformOnMoveRow(j, item.b, this.G, item.c);
            this.H.set(i, this.F);
            this.I.put(new Pair<>(Integer.valueOf(this.F.b), Integer.valueOf(this.F.c)), Integer.valueOf(i));
            this.F = null;
        }
    }

    @Override // com.flybird.FBListView.FBListViewDragListener
    public void onDragViewMoved(int i, int i2) {
        int i3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fddd2382", new Object[]{this, new Integer(i), new Integer(i2)});
        } else if (i != i2) {
            Item item = this.H.get(i);
            Item item2 = this.H.get(i2);
            if (item.b == item2.b && (i3 = item2.c) != -1) {
                int i4 = item.c;
                item.c = i3;
                item2.c = i4;
                this.H.remove(i);
                this.I.remove(new Pair(Integer.valueOf(item.b), Integer.valueOf(item.c)));
                this.H.add(i2, item);
                this.I.put(new Pair<>(Integer.valueOf(item.b), Integer.valueOf(item.c)), Integer.valueOf(i2));
            }
        }
    }

    @Override // com.flybird.FBListView.FBListViewDragListener
    public void onDragViewStart(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a307352", new Object[]{this, new Integer(i)});
            return;
        }
        Item item = this.H.get(i);
        this.F = item;
        this.G = item.c;
    }

    @Override // com.flybird.FBView
    public void updateEvent(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("278e3c6c", new Object[]{this, str, str2});
        } else if (str.equals("event") && str2.equals(c4o.KEY_DATA_SOURCE)) {
            BirdNestEngine engine = this.mDoc.getEngine();
            final String nativeNodeToJson = nativeNodeToJson(this.mNode);
            if (nativeNodeToJson == null) {
                FBLogger.e("FBTable", "transform to json failed!");
                return;
            }
            try {
                JSONArray optJSONArray = new JSONObject(nativeNodeToJson).optJSONArray("tplList");
                if (!(optJSONArray == null || optJSONArray.length() == 0)) {
                    return;
                }
                engine.runOnUiThread(new Runnable() { // from class: com.flybird.FBTable.3
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    /* JADX WARN: Removed duplicated region for block: B:49:0x00e2  */
                    /* JADX WARN: Removed duplicated region for block: B:50:0x00e4  */
                    @Override // java.lang.Runnable
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct code enable 'Show inconsistent code' option in preferences
                    */
                    public void run() {
                        /*
                            Method dump skipped, instructions count: 628
                            To view this dump change 'Code comments level' option to 'DEBUG'
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.flybird.FBTable.AnonymousClass3.run():void");
                    }
                });
            } catch (Throwable th) {
                LogCatLog.e("FBTable", th);
            }
        }
    }

    public final FBDocument a(String str, String str2) {
        String str3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FBDocument) ipChange.ipc$dispatch("75917c01", new Object[]{this, str, str2});
        }
        if (this.mDoc == null || this.mDoc.param == null || this.mDoc.param.resourceClient == null) {
            if (this.mDoc == null || this.mDoc.param == null) {
                Objects.toString(Thread.currentThread());
                toString();
                Objects.toString(this.mDoc);
                Objects.toString(this.mDoc == null ? pg1.ATOM_EXT_Null : this.mDoc.param);
                StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
                if (stackTrace != null) {
                    for (StackTraceElement stackTraceElement : stackTrace) {
                        Objects.toString(stackTraceElement);
                    }
                }
            }
            str3 = null;
        } else {
            Object shouldInterceptResource = this.mDoc.param.resourceClient.shouldInterceptResource(str, FBResourceClient.Type.INNER_FRAME);
            str3 = FBDocumentAssistor.a(shouldInterceptResource != null ? String.valueOf(shouldInterceptResource) : null);
        }
        TextUtils.isEmpty(str3);
        if (!TextUtils.isEmpty(str3)) {
            if (TextUtils.isEmpty(str2)) {
                str2 = "{}";
            }
            if (!(this.mDoc == null || this.mDoc.param == null)) {
                BirdNestEngine.Params params = new BirdNestEngine.Params(this.mDoc.param);
                params.varJson = str2;
                params.docType = FBResourceClient.Type.INNER_FRAME;
                params.createImmediately = true;
                if (str3.charAt(0) == '<') {
                    params.tplHtml = str3;
                } else {
                    params.tplJson = str3;
                }
                return (FBDocument) this.mDoc.getEngine().generateFBContext(params);
            }
        }
        return null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0035, code lost:
        if (r7.equals("refresh-style") == false) goto L_0x002c;
     */
    @Override // com.flybird.FBView
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void updateCSS(java.lang.String r7, java.lang.String r8) {
        /*
            r6 = this;
            r0 = 2
            r1 = 0
            r2 = 1
            com.android.alibaba.ip.runtime.IpChange r3 = com.flybird.FBTable.$ipChange
            boolean r4 = r3 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r4 == 0) goto L_0x0018
            java.lang.String r4 = "c310ec95"
            r5 = 3
            java.lang.Object[] r5 = new java.lang.Object[r5]
            r5[r1] = r6
            r5[r2] = r7
            r5[r0] = r8
            r3.ipc$dispatch(r4, r5)
            return
        L_0x0018:
            if (r7 == 0) goto L_0x00a4
            boolean r3 = r6.isDestroyed()
            if (r3 == 0) goto L_0x0022
            goto L_0x00a4
        L_0x0022:
            java.lang.String r3 = "false"
            r4 = -1
            int r5 = r7.hashCode()
            switch(r5) {
                case -1989658977: goto L_0x0044;
                case -1241799045: goto L_0x0038;
                case 1430713407: goto L_0x002e;
                default: goto L_0x002c;
            }
        L_0x002c:
            r0 = -1
            goto L_0x004f
        L_0x002e:
            java.lang.String r1 = "refresh-style"
            boolean r1 = r7.equals(r1)
            if (r1 != 0) goto L_0x004f
            goto L_0x002c
        L_0x0038:
            java.lang.String r0 = "separator-color"
            boolean r0 = r7.equals(r0)
            if (r0 != 0) goto L_0x0042
            goto L_0x002c
        L_0x0042:
            r0 = 1
            goto L_0x004f
        L_0x0044:
            java.lang.String r0 = "loadmore-style"
            boolean r0 = r7.equals(r0)
            if (r0 != 0) goto L_0x004e
            goto L_0x002c
        L_0x004e:
            r0 = 0
        L_0x004f:
            switch(r0) {
                case 0: goto L_0x009d;
                case 1: goto L_0x0063;
                case 2: goto L_0x0056;
                default: goto L_0x0052;
            }
        L_0x0052:
            super.updateCSS(r7, r8)
            goto L_0x00a4
        L_0x0056:
            boolean r7 = r3.equalsIgnoreCase(r8)
            r7 = r7 ^ r2
            r6.O = r7
            com.flybird.APPullRefreshView r8 = r6.A
            r8.setEnablePull(r7)
            goto L_0x00a4
        L_0x0063:
            java.lang.String r0 = "CSS"
            r6.putThemeModeAssociatedActions(r0, r7, r8)
            com.flybird.FBDocument r7 = r6.mDoc
            com.alipay.birdnest.api.BirdNestEngine$ThemeColorProvider r7 = com.flybird.FBDocumentAssistor.c(r7)
            com.flybird.FBDocument r0 = r6.mDoc
            int r0 = com.flybird.FBDocumentAssistor.b(r0)
            boolean r1 = r6.themeModeUseColorMapping
            int r7 = com.flybird.FBTools.parseColor(r8, r7, r0, r1)
            com.flybird.FBListView r8 = r6.C
            android.graphics.drawable.ColorDrawable r0 = new android.graphics.drawable.ColorDrawable
            r0.<init>(r7)
            r8.setDivider(r0)
            com.flybird.FBListView r7 = r6.C
            com.flybird.FBDocument r8 = r6.mDoc
            android.content.Context r8 = r8.k
            android.content.res.Resources r8 = r8.getResources()
            android.util.DisplayMetrics r8 = r8.getDisplayMetrics()
            r0 = 1056964608(0x3f000000, float:0.5)
            float r8 = android.util.TypedValue.applyDimension(r2, r0, r8)
            int r8 = (int) r8
            r7.setDividerHeight(r8)
            goto L_0x00a4
        L_0x009d:
            boolean r7 = r3.equalsIgnoreCase(r8)
            r7 = r7 ^ r2
            r6.P = r7
        L_0x00a4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.flybird.FBTable.updateCSS(java.lang.String, java.lang.String):void");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0036, code lost:
        if (r10.equals("enabledragtoreorder") == false) goto L_0x002e;
     */
    @Override // com.flybird.FBView
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void updateAttr(java.lang.String r10, java.lang.String r11) {
        /*
            Method dump skipped, instructions count: 264
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.flybird.FBTable.updateAttr(java.lang.String, java.lang.String):void");
    }
}
