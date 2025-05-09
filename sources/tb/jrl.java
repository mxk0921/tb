package tb;

import android.text.TextUtils;
import androidx.collection.ArrayMap;
import com.alibaba.android.ultron.vfw.viewholder.BundleLineComponent;
import com.alipay.android.phone.iifaa.did.rpc.model.CredentialRpcData;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.common.model.IDMComponent;
import com.taobao.android.ultron.datamodel.imp.DMComponent;
import com.taobao.android.ultron.datamodel.imp.ParseModule;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class jrl {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(83886195);
    }

    public static List<IDMComponent> b(List<IDMComponent> list, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("34b45457", new Object[]{list, new Boolean(z)});
        }
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (IDMComponent iDMComponent : list) {
            if (c(iDMComponent)) {
                arrayList.add(iDMComponent);
                if (z) {
                    Object remove = iDMComponent.getFields().remove("cornerType");
                    if (iDMComponent.getOnceExtMap() != null) {
                        if (remove == null) {
                            iDMComponent.getOnceExtMap().remove("cornerType");
                        } else {
                            iDMComponent.getOnceExtMap().put("cornerType", remove);
                        }
                    }
                }
            }
        }
        return arrayList;
    }

    public static boolean c(IDMComponent iDMComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b21d9d65", new Object[]{iDMComponent})).booleanValue();
        }
        if (iDMComponent == null || iDMComponent.getStatus() == 0 || iDMComponent.getFields() == null || iDMComponent.getFields().isEmpty() || BundleLineComponent.COMPONENT_TAG.equals(iDMComponent.getType())) {
            return false;
        }
        return true;
    }

    public static void d(u55 u55Var, List<IDMComponent> list, boolean z) {
        boolean z2;
        int i;
        String str;
        int i2 = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2ef980e5", new Object[]{u55Var, list, new Boolean(z)});
            return;
        }
        List<IDMComponent> b = b(list, z);
        if (b != null) {
            if (u55Var == null || !vav.a(u55Var.getBizName(), "enableUpdateOpTypeWhenCornerTypeChanged", false)) {
                z2 = false;
            } else {
                z2 = true;
            }
            String str2 = "";
            IDMComponent iDMComponent = null;
            int i3 = 1;
            while (true) {
                i = 16;
                if (i2 >= b.size() - 1) {
                    break;
                }
                IDMComponent iDMComponent2 = b.get(i2);
                if (iDMComponent2.getExtMap() != null) {
                    ArrayMap<String, Object> extMap = iDMComponent2.getExtMap();
                    String str3 = ParseModule.g;
                    String str4 = (String) extMap.get(str3);
                    if (str4 != null) {
                        iDMComponent = b.get(i2 + 1);
                        str2 = (String) iDMComponent.getExtMap().get(str3);
                        if (str4.equals(str2)) {
                            if (1 == i3) {
                                e(iDMComponent2, 1);
                            }
                            i3++;
                            str = null;
                        } else {
                            if (1 == i3) {
                                i = 17;
                            } else {
                                i3 = 1;
                            }
                            str = a(i);
                            e(iDMComponent2, i);
                        }
                        if (z2) {
                            f(u55Var, iDMComponent2, str);
                        }
                    }
                }
                i2++;
            }
            if (1 == i3) {
                i = 17;
            }
            if (!TextUtils.isEmpty(str2)) {
                e(iDMComponent, i);
            }
        }
    }

    public static void e(IDMComponent iDMComponent, int i) {
        String a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f8832e40", new Object[]{iDMComponent, new Integer(i)});
        } else if (iDMComponent != null && (a2 = a(i)) != null) {
            iDMComponent.getFields().put("cornerType", (Object) a2);
        }
    }

    public static void f(u55 u55Var, IDMComponent iDMComponent, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c8b293b6", new Object[]{u55Var, iDMComponent, str});
        } else if (u55Var != null && (iDMComponent instanceof DMComponent)) {
            DMComponent dMComponent = (DMComponent) iDMComponent;
            if (dMComponent.getDeltaOpType() == null) {
                if (!Objects.equals(str, iDMComponent.getOnceExtMap() != null ? iDMComponent.getOnceExtMap().remove("cornerType") : null)) {
                    dMComponent.setDeltaOpType("replace");
                    u55Var.f0(iDMComponent.getKey(), "replace");
                }
            }
        }
    }

    public static String a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("22335486", new Object[]{new Integer(i)});
        }
        if (i == 1) {
            return "top";
        }
        if (i == 16) {
            return "bottom";
        }
        if (i != 17) {
            return null;
        }
        return CredentialRpcData.ACTION_BOTH;
    }
}
