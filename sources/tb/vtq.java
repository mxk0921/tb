package tb;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.DecelerateInterpolator;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRootView;
import com.taobao.taobao.R;
import com.taobao.taolive.sdk.model.common.ImportantEventItem;
import com.taobao.taolive.sdk.model.message.MessageTypeFilter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import tb.cpr;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class vtq implements w3c, cpr.b, s3c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Context f30245a;
    public final r3c b;
    public ArrayList<ImportantEventItem> c;
    public ArrayList<ImportantEventItem> d;
    public x19 e;
    public final ux9 f;
    public final boolean g;
    public ImportantEventItem h;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a extends MessageTypeFilter {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a(vtq vtqVar) {
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/live/plugin/atype/flexalocal/comments/notify/controller/SubCommonImportantEventController$1");
        }

        @Override // com.taobao.taolive.sdk.model.message.MessageTypeFilter
        public boolean filter(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("c81f1ee8", new Object[]{this, new Integer(i)})).booleanValue();
            }
            if (i == 2888) {
                return true;
            }
            return false;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ImportantEventItem f30246a;

        public b(ImportantEventItem importantEventItem) {
            this.f30246a = importantEventItem;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            vtq.d(vtq.this).d(this.f30246a);
            vtq.e(vtq.this, this.f30246a, "ImportantEventNoticeIssue");
            if (vtq.f(vtq.this) && TextUtils.equals(this.f30246a.isHighestPriority, "true")) {
                vtq.g(vtq.this, this.f30246a);
            } else if (vtq.this.r(this.f30246a)) {
                q0h.b("SubCommonImportantEventController", "onMessageReceived isNeedWaitFrontComponent true type:" + this.f30246a.type);
                vtq.h(vtq.this).add(this.f30246a);
            } else {
                q0h.b("SubCommonImportantEventController", "onMessageReceived addItemToList type:" + this.f30246a.type);
                vtq.g(vtq.this, this.f30246a);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class c implements Comparator<ImportantEventItem> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c(vtq vtqVar) {
        }

        /* renamed from: a */
        public int compare(ImportantEventItem importantEventItem, ImportantEventItem importantEventItem2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("dc045cbd", new Object[]{this, importantEventItem, importantEventItem2})).intValue();
            }
            return importantEventItem.priority - importantEventItem2.priority;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class d implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ImportantEventItem f30247a;
        public final /* synthetic */ int b;

        public d(ImportantEventItem importantEventItem, int i) {
            this.f30247a = importantEventItem;
            this.b = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (vtq.i(vtq.this).contains(this.f30247a)) {
                vtq.j(vtq.this, null);
                vtq.i(vtq.this).remove(this.b);
                vtq.d(vtq.this).f().removeAllViews();
                vtq.d(vtq.this).c();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class e implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            vtq.d(vtq.this).f().removeAllViews();
            vtq.d(vtq.this).c();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class f implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public f() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                vtq.k(vtq.this);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class g implements Animation.AnimationListener {
        public static volatile transient /* synthetic */ IpChange $ipChange = null;
        public static final int IMPORTANT_ANIM_END = 2;
        public static final int IMPORTANT_ANIM_MIDDLE = 1;
        public static final int IMPORTANT_ANIM_START = 0;

        /* renamed from: a  reason: collision with root package name */
        private final int f30250a;

        static {
            t2o.a(295698737);
        }

        public g(int i) {
            this.f30250a = i;
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("724c33d", new Object[]{this, animation});
                return;
            }
            vtq.d(vtq.this).f().clearAnimation();
            animation.setAnimationListener(null);
            b(this.f30250a);
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8f2883e7", new Object[]{this, animation});
            }
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f2d146c4", new Object[]{this, animation});
            }
        }

        private void b(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d9923fcc", new Object[]{this, new Integer(i)});
            } else if (i == 0) {
                try {
                    Animation loadAnimation = AnimationUtils.loadAnimation(vtq.d(vtq.this).f().getContext(), R.anim.taolive_certification_in2_flexalocal);
                    loadAnimation.setAnimationListener(new g(1));
                    loadAnimation.setDuration(500L);
                    vtq.d(vtq.this).f().startAnimation(loadAnimation);
                } catch (Throwable th) {
                    o3s.b("SubCommonImportantEventController", "onEnterAnimationEnd exception: " + th.getMessage());
                }
            }
        }
    }

    static {
        t2o.a(295698730);
        t2o.a(295698713);
        t2o.a(806356196);
        t2o.a(806355016);
    }

    public vtq(r3c r3cVar, Context context, t54 t54Var, boolean z) {
        this.f30245a = context;
        this.b = r3cVar;
        this.f = t54Var;
        this.g = z;
    }

    public static /* synthetic */ r3c d(vtq vtqVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (r3c) ipChange.ipc$dispatch("20458b1", new Object[]{vtqVar});
        }
        return vtqVar.b;
    }

    public static /* synthetic */ void e(vtq vtqVar, ImportantEventItem importantEventItem, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c37858bd", new Object[]{vtqVar, importantEventItem, str});
        } else {
            vtqVar.v(importantEventItem, str);
        }
    }

    public static /* synthetic */ boolean f(vtq vtqVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("878a4fc9", new Object[]{vtqVar})).booleanValue();
        }
        return vtqVar.g;
    }

    public static /* synthetic */ void g(vtq vtqVar, ImportantEventItem importantEventItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e2fb7ab5", new Object[]{vtqVar, importantEventItem});
        } else {
            vtqVar.l(importantEventItem);
        }
    }

    public static /* synthetic */ ArrayList h(vtq vtqVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ArrayList) ipChange.ipc$dispatch("36135d21", new Object[]{vtqVar});
        }
        return vtqVar.d;
    }

    public static /* synthetic */ ArrayList i(vtq vtqVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ArrayList) ipChange.ipc$dispatch("3826bc22", new Object[]{vtqVar});
        }
        return vtqVar.c;
    }

    public static /* synthetic */ ImportantEventItem j(vtq vtqVar, ImportantEventItem importantEventItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ImportantEventItem) ipChange.ipc$dispatch("12bec04b", new Object[]{vtqVar, importantEventItem});
        }
        vtqVar.h = importantEventItem;
        return importantEventItem;
    }

    public static /* synthetic */ void k(vtq vtqVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6f11f4a", new Object[]{vtqVar});
        } else {
            vtqVar.n();
        }
    }

    public static HashMap<String, String> q(String str) {
        String[] split;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("f383ba85", new Object[]{str});
        }
        HashMap<String, String> hashMap = new HashMap<>();
        try {
            if (!TextUtils.isEmpty(str)) {
                for (String str2 : str.split(",")) {
                    if (str2.contains("=")) {
                        String[] split2 = str2.split("=");
                        hashMap.put(split2[0], split2[1]);
                    }
                }
            }
        } catch (Exception e2) {
            q0h.b("SubCommonImportantEventController", "generateUTArgs error " + e2.getMessage());
        }
        return hashMap;
    }

    @Override // tb.s3c
    public String bizCode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("36951559", new Object[]{this});
        }
        return "SubCommonImportantEvent";
    }

    @Override // tb.w3c
    public void destroy() {
        boolean z;
        View childAt;
        boolean z2 = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        q0h.b("SubCommonImportantEventController", "destroy");
        sjr.g().b(this);
        try {
            r3c r3cVar = this.b;
            if (!(r3cVar == null || r3cVar.f() == null)) {
                int childCount = this.b.f().getChildCount();
                if (childCount > 0 && (childAt = this.b.f().getChildAt(0)) != null) {
                    Animation animation = childAt.getAnimation();
                    if (animation != null) {
                        animation.cancel();
                    }
                    childAt.clearAnimation();
                }
                this.b.f().removeAllViews();
                q0h.b("SubCommonImportantEventController", "destroy removeAllViews childCount：" + childCount);
            }
            r3c r3cVar2 = this.b;
            if (r3cVar2 != null) {
                r3cVar2.a(false);
                q0h.b("SubCommonImportantEventController", "destroy removeAllViews endConsumeMessage");
            }
        } catch (Exception e2) {
            q0h.b("SubCommonImportantEventController", "destroy try catch:" + e2.getMessage());
        }
        r3c r3cVar3 = this.b;
        if (r3cVar3 != null) {
            if (r3cVar3.getFrameContext() != null) {
                z = true;
            } else {
                z = false;
            }
            if (this.b.getFrameContext().t() != null) {
                z2 = true;
            }
            if (z2 && z) {
                this.b.getFrameContext().t().a(this);
            }
        }
        x19 x19Var = this.e;
        if (x19Var != null) {
            x19Var.c();
        }
        ArrayList<ImportantEventItem> arrayList = this.c;
        if (arrayList != null) {
            arrayList.clear();
        }
        ArrayList<ImportantEventItem> arrayList2 = this.d;
        if (arrayList2 != null) {
            arrayList2.clear();
        }
    }

    @Override // tb.w3c
    public int getPriority() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("49b31e94", new Object[]{this})).intValue();
        }
        return 5;
    }

    @Override // tb.w3c
    public void init() {
        boolean z;
        boolean z2 = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
            return;
        }
        a4s.b(this.f30245a, sjr.g(), this);
        this.c = new ArrayList<>();
        this.d = new ArrayList<>();
        this.e = new x19();
        r3c r3cVar = this.b;
        if (r3cVar != null) {
            if (r3cVar.getFrameContext() != null) {
                z = true;
            } else {
                z = false;
            }
            if (this.b.getFrameContext().t() != null) {
                z2 = true;
            }
            if (z2 && z) {
                this.b.getFrameContext().t().l(this, new a(this));
            }
        }
    }

    public final void l(ImportantEventItem importantEventItem) {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("afeccfa3", new Object[]{this, importantEventItem});
            return;
        }
        ArrayList<ImportantEventItem> arrayList = this.c;
        if (arrayList != null && !arrayList.isEmpty()) {
            while (true) {
                if (i < this.c.size()) {
                    if (this.c.get(i).priority > importantEventItem.priority) {
                        this.c.add(i, importantEventItem);
                        break;
                    } else if (i == this.c.size() - 1) {
                        this.c.add(importantEventItem);
                        break;
                    } else {
                        i++;
                    }
                } else {
                    break;
                }
            }
        } else {
            ArrayList<ImportantEventItem> arrayList2 = this.c;
            if (arrayList2 != null) {
                arrayList2.add(importantEventItem);
            }
        }
        this.b.b();
    }

    public final boolean m(ImportantEventItem importantEventItem) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8d4b7367", new Object[]{this, importantEventItem})).booleanValue();
        }
        ImportantEventItem.FatigueInfo fatigueInfo = importantEventItem.fatigueInfo;
        if (fatigueInfo == null || fatigueInfo.showNums <= 0) {
            return false;
        }
        ImportantEventItem.FatigueInfo d2 = this.e.d(fatigueInfo.fatigueKey);
        if (d2 == null) {
            fatigueInfo.showNums = 1L;
        } else {
            long j = fatigueInfo.showNums;
            long j2 = d2.showNums;
            if (j <= j2) {
                q0h.b("SubCommonImportantEventController", "checkFatigueInfo isHitFatigue true");
                this.e.e(fatigueInfo);
                return z;
            }
            fatigueInfo.showNums = j2 + 1;
            q0h.b("SubCommonImportantEventController", "checkFatigueInfo writeFatigueInfo" + d2.showNums);
        }
        z = false;
        this.e.e(fatigueInfo);
        return z;
    }

    public final void n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("74e0b813", new Object[]{this});
            return;
        }
        try {
            Animation loadAnimation = AnimationUtils.loadAnimation(this.b.f().getContext(), R.anim.taolive_certification_out_flexalocal);
            loadAnimation.setAnimationListener(new g(2));
            loadAnimation.setDuration(500L);
            this.b.f().clearAnimation();
            this.b.f().startAnimation(loadAnimation);
        } catch (Throwable th) {
            o3s.b("SubCommonImportantEventController", "endAnim e: " + th.getMessage());
        }
    }

    public final boolean o(ImportantEventItem importantEventItem) {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5e91076d", new Object[]{this, importantEventItem})).booleanValue();
        }
        if (this.f == null || importantEventItem == null || (jSONObject = importantEventItem.dataMessage) == null) {
            return false;
        }
        String string = jSONObject.getString("liveId");
        if (TextUtils.isEmpty(string) || TextUtils.isEmpty(this.f.i) || string.equals(this.f.i)) {
            return false;
        }
        return true;
    }

    @Override // tb.s3c
    public String[] observeEvents() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String[]) ipChange.ipc$dispatch("37b2602b", new Object[]{this});
        }
        return new String[]{"com.taobao.taolive.room.important_event_goods_recommend", uyg.c, uyg.d};
    }

    @Override // tb.s3c
    public String observeUniqueIdentification() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4914bdfe", new Object[]{this});
        }
        ux9 ux9Var = this.f;
        if (ux9Var == null) {
            return null;
        }
        return ux9Var.C();
    }

    @Override // tb.s3c
    public void onEvent(String str, Object obj) {
        r3c r3cVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c3897928", new Object[]{this, str, obj});
        } else if ("com.taobao.taolive.room.important_event_goods_recommend".equals(str) && (obj instanceof ImportantEventItem)) {
            ImportantEventItem importantEventItem = (ImportantEventItem) obj;
            if (!o(importantEventItem)) {
                t(importantEventItem);
            }
        } else if (uyg.c.equals(str)) {
            r3c r3cVar2 = this.b;
            if (r3cVar2 != null && r3cVar2.getRootView() != null) {
                this.b.getRootView().setVisibility(8);
            }
        } else if (uyg.d.equals(str) && (r3cVar = this.b) != null && r3cVar.getRootView() != null) {
            this.b.getRootView().setVisibility(0);
        }
    }

    @Override // tb.gtc
    public void onMessageReceived(int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b152aef", new Object[]{this, new Integer(i), obj});
        } else if (i == 2888 && (obj instanceof String)) {
            try {
                t((ImportantEventItem) fkx.f((String) obj, ImportantEventItem.class));
            } catch (Exception e2) {
                o3s.b("SubCommonImportantEventController", e2.getMessage());
            }
        }
    }

    public final HashMap<String, String> p(ImportantEventItem.UTParams uTParams) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("4abec2c3", new Object[]{this, uTParams});
        }
        if (uTParams == null) {
            return new HashMap<>();
        }
        return q(uTParams.showParams);
    }

    public final void t(ImportantEventItem importantEventItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b58e834", new Object[]{this, importantEventItem});
        } else {
            this.b.getHandler().post(new b(importantEventItem));
        }
    }

    public final void u(ImportantEventItem importantEventItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("240646d5", new Object[]{this, importantEventItem});
            return;
        }
        this.b.f().removeAllViews();
        DXRootView createDX = d9m.n().createDX(this.b.f().getContext(), importantEventItem.templateName);
        if (createDX != null) {
            this.b.f().addView(createDX);
            JSONObject jSONObject = importantEventItem.dataMessage;
            if (jSONObject != null) {
                jSONObject.put("utParams", (Object) importantEventItem.utParams);
                d9m.n().renderDX(createDX, importantEventItem.dataMessage);
            }
        }
    }

    public final void v(ImportantEventItem importantEventItem, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e70f245c", new Object[]{this, importantEventItem, str});
            return;
        }
        giv.f().p(this.f, str, p(importantEventItem.utParams));
        q0h.b("SubCommonImportantEventController", "showTrackInfo:" + str + " " + importantEventItem.utParams.showParams);
    }

    public void y(List<ImportantEventItem> list) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f1976c0b", new Object[]{this, list});
        } else if (list != null) {
            for (ImportantEventItem importantEventItem : list) {
                if (this.g && TextUtils.equals(importantEventItem.isHighestPriority, "true")) {
                    this.c.add(importantEventItem);
                } else if (r(importantEventItem)) {
                    this.d.add(importantEventItem);
                    StringBuilder sb = new StringBuilder("need wait front component:");
                    sb.append(importantEventItem.type);
                    sb.append(" utParams:");
                    ImportantEventItem.UTParams uTParams = importantEventItem.utParams;
                    if (uTParams == null) {
                        str = "";
                    } else {
                        str = uTParams.showParams;
                    }
                    sb.append(str);
                    q0h.b("SubCommonImportantEventController", sb.toString());
                } else {
                    this.c.add(importantEventItem);
                }
                this.b.d(importantEventItem);
                v(importantEventItem, "ImportantEventNoticeIssue");
            }
            Collections.sort(this.c, new c(this));
            if (!this.g) {
                this.b.b();
            }
        }
    }

    public final boolean s(ImportantEventItem importantEventItem) {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4d481fa5", new Object[]{this, importantEventItem})).booleanValue();
        }
        if (!(importantEventItem == null || (jSONObject = importantEventItem.configInfo) == null || !jSONObject.containsKey("abInfo"))) {
            JSONObject jSONObject2 = jSONObject.getJSONObject("abInfo");
            if (jSONObject2.containsKey("component") && jSONObject2.containsKey("module") && jSONObject2.containsKey("key")) {
                String string = jSONObject2.getString("component");
                String string2 = jSONObject2.getString("module");
                String string3 = jSONObject2.getString("key");
                q0h.b("SubCommonImportantEventController", "isNotHitAB abInfo:" + string + " " + string2 + " " + string3);
                return k0r.T(string, string2, string3);
            }
        }
        return true;
    }

    public final void w() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d8157c9a", new Object[]{this});
            return;
        }
        try {
            Animation loadAnimation = AnimationUtils.loadAnimation(this.b.f().getContext(), R.anim.taolive_certification_in_flexalocal);
            loadAnimation.setAnimationListener(new g(0));
            loadAnimation.setDuration(500L);
            loadAnimation.setInterpolator(new DecelerateInterpolator());
            this.b.f().clearAnimation();
            this.b.f().startAnimation(loadAnimation);
        } catch (Throwable th) {
            o3s.b("SubCommonImportantEventController", "startAnim exception: " + th.getMessage());
        }
    }

    @Override // tb.w3c
    public boolean a() {
        ArrayList<ImportantEventItem> arrayList;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1a5d7491", new Object[]{this})).booleanValue();
        }
        if (!this.g || (arrayList = this.c) == null || arrayList.isEmpty()) {
            return false;
        }
        boolean z = false;
        for (int i = 0; i < this.c.size(); i++) {
            ImportantEventItem importantEventItem = this.c.get(i);
            if (importantEventItem != null && TextUtils.equals(importantEventItem.isHighestPriority, "true")) {
                z = true;
            }
        }
        return z;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x008c  */
    @Override // tb.w3c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void b() {
        /*
            Method dump skipped, instructions count: 366
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.vtq.b():void");
    }

    @Override // tb.w3c
    public boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("998f87af", new Object[]{this})).booleanValue();
        }
        ArrayList<ImportantEventItem> arrayList = this.c;
        if (arrayList == null || arrayList.isEmpty()) {
            return false;
        }
        q0h.b("SubCommonImportantEventController", "size:" + this.c.size());
        return true;
    }

    public boolean r(ImportantEventItem importantEventItem) {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6efd623", new Object[]{this, importantEventItem})).booleanValue();
        }
        if (importantEventItem == null || (jSONObject = importantEventItem.configInfo) == null || !jSONObject.containsKey("name") || !importantEventItem.configInfo.containsKey("type")) {
            return false;
        }
        String string = importantEventItem.configInfo.getString("name");
        if (!TextUtils.equals(importantEventItem.configInfo.getString("type"), "h5Component")) {
            return false;
        }
        return !this.b.e(string);
    }

    public void x() {
        String str;
        ImportantEventItem importantEventItem;
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("da5dbb49", new Object[]{this});
        } else if (!this.g || (importantEventItem = this.h) == null || r(importantEventItem)) {
            ArrayList<ImportantEventItem> arrayList = this.d;
            if (arrayList != null && !arrayList.isEmpty()) {
                while (i < this.d.size()) {
                    ImportantEventItem importantEventItem2 = this.d.get(i);
                    if (importantEventItem2 != null && !r(importantEventItem2)) {
                        this.d.remove(i);
                        i--;
                        l(importantEventItem2);
                        StringBuilder sb = new StringBuilder("tryPutSavedMessageToQueue addItemToList type:");
                        sb.append(importantEventItem2.type);
                        sb.append(" showParams:");
                        ImportantEventItem.UTParams uTParams = importantEventItem2.utParams;
                        if (uTParams == null) {
                            str = "";
                        } else {
                            str = uTParams.showParams;
                        }
                        sb.append(str);
                        q0h.b("SubCommonImportantEventController", sb.toString());
                    }
                    i++;
                }
            }
        } else {
            b();
        }
    }
}
