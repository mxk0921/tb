package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.nx3.bean.TemplateBean;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class fbk {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public yko f19169a;

    static {
        t2o.a(993001921);
    }

    public String a(Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("fae57c22", new Object[]{this, map});
        }
        return b(map).toJSONString();
    }

    public JSONObject b(Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("349e6176", new Object[]{this, map});
        }
        JSONObject jSONObject = new JSONObject();
        if (map != null) {
            try {
                for (Map.Entry<String, Object> entry : map.entrySet()) {
                    String key = entry.getKey();
                    Object value = entry.getValue();
                    if (!TextUtils.isEmpty(key)) {
                        jSONObject.put(key, value);
                    }
                }
            } catch (Exception unused) {
                this.f19169a.l().d("NxWeexUtil", "weex init data error");
            }
        }
        return jSONObject;
    }

    public void c(Map<String, TemplateBean> map, Map<String, TemplateBean> map2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("193ac948", new Object[]{this, map, map2});
        } else if (map2 != null && map2.size() != 0) {
            for (Map.Entry<String, TemplateBean> entry : map2.entrySet()) {
                String key = entry.getKey();
                TemplateBean value = entry.getValue();
                if (TextUtils.isEmpty(key)) {
                    this.f19169a.l().d("NxWeexUtil", "mergeTemplates: key is empty");
                } else if (value == null) {
                    this.f19169a.l().d("NxWeexUtil", "mergeTemplates: bean is empty");
                } else if (map.containsKey(key)) {
                    this.f19169a.l().b("NxWeexUtil", "mergeTemplates: 模板已存在");
                } else {
                    map.put(key, value);
                }
            }
        }
    }

    public void d(yko ykoVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("43717c33", new Object[]{this, ykoVar});
        } else {
            this.f19169a = ykoVar;
        }
    }

    public boolean e(TemplateBean templateBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9b4154a2", new Object[]{this, templateBean})).booleanValue();
        }
        if (templateBean == null) {
            this.f19169a.l().d("NxWeexUtil", "模板为空, 请检查templateName和tItemType是不是一致的.");
            return true;
        } else if (TextUtils.isEmpty(templateBean.url)) {
            c4p l = this.f19169a.l();
            l.d("NxWeexUtil", "模板url为空: " + templateBean);
            return true;
        } else if (TextUtils.isEmpty(templateBean.templateName)) {
            c4p l2 = this.f19169a.l();
            l2.d("NxWeexUtil", "模板名称为空: " + templateBean);
            return true;
        } else if (TextUtils.isEmpty(templateBean.version)) {
            c4p l3 = this.f19169a.l();
            l3.d("NxWeexUtil", "模板版本为空: " + templateBean);
            return true;
        } else if (!TextUtils.isEmpty(templateBean.md5)) {
            return false;
        } else {
            c4p l4 = this.f19169a.l();
            l4.d("NxWeexUtil", "模板MD5为空: " + templateBean);
            return true;
        }
    }
}
