package tb;

import android.text.TextUtils;
import android.util.Log;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tinct.ITinctOperater;
import com.taobao.tinct.impl.collect.ChangeRecord;
import com.taobao.tinct.model.ABChangeInfo;
import com.taobao.tinct.model.BaseChangeInfo;
import com.taobao.tinct.model.ChangeType;
import com.taobao.tinct.model.CustomChangeInfo;
import com.taobao.tinct.model.OrangeChangeInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class nwt extends ITinctOperater {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final List<BaseChangeInfo> f25009a = new ArrayList();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] $SwitchMap$com$taobao$tinct$model$ChangeType;

        static {
            int[] iArr = new int[ChangeType.values().length];
            $SwitchMap$com$taobao$tinct$model$ChangeType = iArr;
            try {
                iArr[ChangeType.ORANGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$taobao$tinct$model$ChangeType[ChangeType.AB.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$taobao$tinct$model$ChangeType[ChangeType.CUSTOM.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public static /* synthetic */ void e(CustomChangeInfo customChangeInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9d348fea", new Object[]{customChangeInfo});
        } else if (!com.taobao.tinct.impl.config.a.t(customChangeInfo)) {
            Log.e("TinctOperator", "The custom change is disable: " + customChangeInfo.getHashKey());
        } else if (bi3.g().r(customChangeInfo)) {
            kwt.c(customChangeInfo, "change");
        }
    }

    public static /* synthetic */ Object ipc$super(nwt nwtVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tinct/impl/collect/TinctOperator");
    }

    public final void b(final CustomChangeInfo customChangeInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("14c35d76", new Object[]{this, customChangeInfo});
        } else {
            pwt.b().a(new Runnable() { // from class: tb.mwt
                @Override // java.lang.Runnable
                public final void run() {
                    nwt.e(CustomChangeInfo.this);
                }
            });
        }
    }

    public final void c(BaseChangeInfo baseChangeInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("51818d47", new Object[]{this, baseChangeInfo});
            return;
        }
        synchronized (this.f25009a) {
            ((ArrayList) this.f25009a).add(baseChangeInfo);
        }
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("691cc330", new Object[]{this});
            return;
        }
        synchronized (this.f25009a) {
            try {
                if (!((ArrayList) this.f25009a).isEmpty()) {
                    Iterator it = ((ArrayList) this.f25009a).iterator();
                    while (it.hasNext()) {
                        BaseChangeInfo baseChangeInfo = (BaseChangeInfo) it.next();
                        StringBuilder sb = new StringBuilder();
                        sb.append("Handle cache change of ");
                        sb.append(baseChangeInfo.getChangeType().name());
                        int i = a.$SwitchMap$com$taobao$tinct$model$ChangeType[baseChangeInfo.getChangeType().ordinal()];
                        if (i == 1) {
                            markOrangeUsed(baseChangeInfo.getBizName(), ((OrangeChangeInfo) baseChangeInfo).getNameSpace());
                        } else if (i == 2) {
                            ABChangeInfo aBChangeInfo = (ABChangeInfo) baseChangeInfo;
                            markABUsed(aBChangeInfo.getBizName(), aBChangeInfo.getExperimentId(), aBChangeInfo.getBucketId(), aBChangeInfo.getPublishId());
                        } else if (i == 3) {
                            b((CustomChangeInfo) baseChangeInfo);
                        }
                    }
                    ((ArrayList) this.f25009a).clear();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.taobao.tinct.ITinctOperater
    public String getTinctInfo(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a80ef40d", new Object[]{this, str});
        }
        if (!lwt.b().get() || TextUtils.isEmpty(str)) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        ChangeRecord f = bi3.g().f();
        if (f == null) {
            return "";
        }
        List<String> b = com.taobao.tinct.impl.config.a.b(str);
        boolean z = true;
        for (OrangeChangeInfo orangeChangeInfo : f.orangeChangeMap.values()) {
            if (orangeChangeInfo != null && orangeChangeInfo.getStatus() == 1 && ((b != null && b.contains(orangeChangeInfo.getNameSpace())) || str.equals(orangeChangeInfo.getBizName()))) {
                if (!z) {
                    sb.append("^");
                }
                sb.append(orangeChangeInfo.getTinctTag());
                z = false;
            }
        }
        for (ABChangeInfo aBChangeInfo : f.abInfoMap.values()) {
            if (str.equals(aBChangeInfo.getBizName())) {
                if (!z) {
                    sb.append("^");
                }
                sb.append(aBChangeInfo.getTinctTag());
                z = false;
            }
        }
        ConcurrentHashMap<String, List<vks>> concurrentHashMap = f.touchStoneInfo;
        if (concurrentHashMap.containsKey(str)) {
            for (vks vksVar : concurrentHashMap.get(str)) {
                if (!z) {
                    sb.append("^");
                }
                sb.append(vksVar.getTinctTag());
                z = false;
            }
        }
        for (CustomChangeInfo customChangeInfo : f.customInfo.values()) {
            if (str.equals(customChangeInfo.getBizName()) && !customChangeInfo.isExpire()) {
                if (!z) {
                    sb.append("^");
                }
                sb.append(customChangeInfo.getTinctTag());
                z = false;
            }
        }
        return sb.toString();
    }

    @Override // com.taobao.tinct.ITinctOperater
    public void markABUsed(String str, String str2, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f910ddba", new Object[]{this, str, str2, str3, str4});
        } else if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3) && !TextUtils.isEmpty(str4)) {
            if (!lwt.b().get()) {
                c(ABChangeInfo.builder(str2, str3, str4).setBizName(str));
            } else if (com.taobao.tinct.impl.config.a.r()) {
                ABChangeInfo bizName = ABChangeInfo.builder(str2, str3, str4).setBizName(str);
                if (bi3.g().q(bizName)) {
                    kwt.a(bizName, kwt.UPLOAD_TYPE_EFFECT);
                }
            }
        }
    }

    @Override // com.taobao.tinct.ITinctOperater
    public void markChanged(String str, String str2, String str3, String str4, Boolean bool) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("77be6537", new Object[]{this, str, str2, str3, str4, bool});
            return;
        }
        CustomChangeInfo customChangeInfo = new CustomChangeInfo(str, str2, str3, str4, bool);
        if (!customChangeInfo.isValid()) {
            Log.e("TinctOperator", "The custom change info is invalid!");
        } else if (!lwt.b().get()) {
            c(customChangeInfo);
        } else {
            b(customChangeInfo);
        }
    }

    @Override // com.taobao.tinct.ITinctOperater
    public void markOrangeUsed(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c4e16fd3", new Object[]{this, str, str2});
        } else if (!TextUtils.isEmpty(str2)) {
            if (!lwt.b().get()) {
                OrangeChangeInfo orangeChangeInfo = new OrangeChangeInfo();
                orangeChangeInfo.setNameSpace(str2);
                orangeChangeInfo.setBizName(str);
                c(orangeChangeInfo);
                return;
            }
            OrangeChangeInfo h = bi3.g().h(str2);
            if (h == null) {
                Log.e("TinctOperator", "Can't find the change info for: " + str2);
                return;
            }
            h.setUsed(true);
            h.setBizName(str);
            kwt.m(h, kwt.UPLOAD_TYPE_EFFECT);
        }
    }

    @Override // com.taobao.tinct.ITinctOperater
    public void markBatchTouchStoneUsed(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4211a92b", new Object[]{this, str, str2});
        } else if (!TextUtils.isEmpty(str2) && lwt.b().get() && com.taobao.tinct.impl.config.a.K()) {
            List<String> n = com.taobao.tinct.impl.config.a.n();
            String[] split = str2.split("_");
            if (split.length > 0 && !n.isEmpty()) {
                for (String str3 : split) {
                    if (n.contains("ts|" + str + "|" + str3)) {
                        vks vksVar = new vks(str, str3);
                        if (bi3.g().v(vksVar)) {
                            kwt.p(vksVar, kwt.UPLOAD_TYPE_EFFECT);
                        }
                    }
                }
            }
        }
    }
}
