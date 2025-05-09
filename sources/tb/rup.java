package tb;

import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tbreachflow.shortcuts.bean.ContentMapVO;
import com.taobao.tbreachflow.shortcuts.bean.ContentVO;
import com.taobao.tbreachflow.shortcuts.bean.ModuleVO;
import com.taobao.tbreachflow.shortcuts.bean.ShortcutsVO;
import java.util.ArrayList;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class rup {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public yyb f27620a;

    public ContentVO a(String str) {
        ContentMapVO contentMap;
        ShortcutsVO shortcuts;
        List<ContentVO> content;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ContentVO) ipChange.ipc$dispatch("bb474f51", new Object[]{this, str});
        }
        try {
            ModuleVO moduleVO = (ModuleVO) JSON.parseObject(str, ModuleVO.class);
            if (moduleVO == null || (contentMap = moduleVO.getContentMap()) == null || (shortcuts = contentMap.getShortcuts()) == null || (content = shortcuts.getContent()) == null || content.isEmpty()) {
                return null;
            }
            return content.get(0);
        } catch (Exception e) {
            aqa.a("convertJsonToModel: parseObject error -> " + e.getMessage());
            return null;
        }
    }

    public final void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("84557795", new Object[]{this});
            return;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add("android_default");
        ud7.d().e("shortcuts", arrayList, null, this.f27620a);
    }

    public void c(yyb yybVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("da8ed939", new Object[]{this, yybVar});
            return;
        }
        this.f27620a = yybVar;
        b();
    }
}
