package tb;

import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class spg extends qfw {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(1039138851);
    }

    public static /* synthetic */ Object ipc$super(spg spgVar, String str, Object... objArr) {
        if (str.hashCode() == -1666188206) {
            spgVar.e((View) objArr[0], (HashMap) objArr[1], (cjd) objArr[2]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/tmall/stylekit/render/LinearLayoutRender");
    }

    @Override // tb.qfw, tb.cik
    public void a(Object obj, String str, String str2, cjd cjdVar, String str3) {
        LinearLayout linearLayout;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d46ca812", new Object[]{this, obj, str, str2, cjdVar, str3});
        } else if ((obj instanceof LinearLayout) && (linearLayout = (LinearLayout) obj) != null) {
            String str4 = ntq.i().k(str3).get(str2);
            if (!TextUtils.isEmpty(str4)) {
                str2 = str4;
            }
            HashMap<String, Object> hashMap = ntq.i().g(str, str3).get(str2);
            if (hashMap != null && hashMap.size() != 0) {
                j(linearLayout, hashMap, cjdVar);
            }
        }
    }

    public void j(LinearLayout linearLayout, HashMap<String, Object> hashMap, cjd cjdVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("80104327", new Object[]{this, linearLayout, hashMap, cjdVar});
        } else if (linearLayout != null && hashMap != null && hashMap.size() != 0) {
            if (cjdVar != null) {
                cjdVar.c(linearLayout);
            }
            for (Map.Entry<String, Object> entry : hashMap.entrySet()) {
                String valueOf = String.valueOf(entry.getKey());
                if (!TextUtils.isEmpty(valueOf)) {
                    Object value = entry.getValue();
                    try {
                        switch (cdw.a(valueOf)) {
                            case 10352:
                                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) linearLayout.getLayoutParams();
                                if (layoutParams != null) {
                                    layoutParams.gravity = Integer.parseInt(value.toString());
                                    linearLayout.setLayoutParams(layoutParams);
                                    break;
                                } else {
                                    break;
                                }
                            case 10353:
                                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) linearLayout.getLayoutParams();
                                if (layoutParams2 != null) {
                                    layoutParams2.weight = Integer.parseInt(value.toString());
                                    linearLayout.setLayoutParams(layoutParams2);
                                    break;
                                } else {
                                    break;
                                }
                            case 10354:
                                if (Integer.parseInt(value.toString()) == 0) {
                                    linearLayout.setOrientation(0);
                                    break;
                                } else {
                                    linearLayout.setOrientation(1);
                                    break;
                                }
                        }
                    } catch (Throwable th) {
                        mgh.b(th);
                    }
                }
            }
            e(linearLayout, hashMap, null);
            if (cjdVar != null) {
                cjdVar.a(linearLayout);
            }
        }
    }
}
