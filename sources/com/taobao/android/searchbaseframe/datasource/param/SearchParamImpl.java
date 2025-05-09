package com.taobao.android.searchbaseframe.datasource.param;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.datasource.param.SearchParam;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class SearchParamImpl implements SearchParam {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final Map<String, SearchParam.Param> mMap = new ConcurrentHashMap();

    static {
        t2o.a(993001790);
        t2o.a(993001788);
    }

    private SearchParam.Param ensureParam(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SearchParam.Param) ipChange.ipc$dispatch("dfbc84a1", new Object[]{this, str});
        }
        SearchParam.Param param = this.mMap.get(str);
        if (param != null) {
            return param;
        }
        SearchParam.Param param2 = new SearchParam.Param(str);
        this.mMap.put(str, param2);
        return param2;
    }

    @Override // com.taobao.android.searchbaseframe.datasource.param.SearchParam
    public void addParamSetValue(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3b921d6", new Object[]{this, str, str2});
        } else {
            ensureParam(str).addSetValue(str2);
        }
    }

    @Override // com.taobao.android.searchbaseframe.datasource.param.SearchParam
    public void addParamSetValues(String str, Collection<String> collection) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("da29729a", new Object[]{this, str, collection});
        } else if (collection != null) {
            ensureParam(str).addSetValue(collection);
        }
    }

    @Override // com.taobao.android.searchbaseframe.datasource.param.SearchParam
    public void addParams(Map<String, SearchParam.Param> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2af7a337", new Object[]{this, map});
        } else if (map != null) {
            this.mMap.putAll(map);
        }
    }

    @Override // com.taobao.android.searchbaseframe.datasource.param.SearchParam
    public void clearParamSetValue(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("96dea5e0", new Object[]{this, str});
        } else {
            ensureParam(str).clearSetValue();
        }
    }

    @Override // com.taobao.android.searchbaseframe.datasource.param.SearchParam
    public boolean containsKey(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f324f255", new Object[]{this, str})).booleanValue();
        }
        return this.mMap.containsKey(str);
    }

    @Override // com.taobao.android.searchbaseframe.datasource.param.SearchParam
    public boolean containsParamValue(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("68393382", new Object[]{this, str, str2})).booleanValue();
        }
        SearchParam.Param param = this.mMap.get(str);
        if (param == null) {
            return false;
        }
        if (param.hasMultiValues()) {
            return param.containsValue(str2);
        }
        return TextUtils.equals(param.getValue(), str2);
    }

    public void copy(SearchParamImpl searchParamImpl) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("41fb975e", new Object[]{this, searchParamImpl});
        } else if (searchParamImpl != null) {
            this.mMap.clear();
            for (Map.Entry<String, SearchParam.Param> entry : searchParamImpl.mMap.entrySet()) {
                SearchParam.Param value = entry.getValue();
                SearchParam.Param param = new SearchParam.Param(entry.getKey());
                param.mValue = value.mValue;
                param.mValuesCache = value.mValuesCache;
                if (value.mValueSet != null) {
                    HashSet hashSet = new HashSet();
                    param.mValueSet = hashSet;
                    hashSet.addAll(value.mValueSet);
                }
                this.mMap.put(entry.getKey(), param);
            }
        }
    }

    @Override // com.taobao.android.searchbaseframe.datasource.param.SearchParam
    public Map<String, String> createUrlParams() {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("6bad5875", new Object[]{this});
        }
        HashMap hashMap = new HashMap(this.mMap.size());
        for (Map.Entry<String, SearchParam.Param> entry : this.mMap.entrySet()) {
            String key = entry.getKey();
            SearchParam.Param value = entry.getValue();
            if (value != null) {
                str = value.toUrlParamString();
            } else {
                str = "";
            }
            hashMap.put(key, str);
        }
        return hashMap;
    }

    @Override // com.taobao.android.searchbaseframe.datasource.param.SearchParam
    public SearchParam.Param getParam(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SearchParam.Param) ipChange.ipc$dispatch("346a1489", new Object[]{this, str});
        }
        return this.mMap.get(str);
    }

    @Override // com.taobao.android.searchbaseframe.datasource.param.SearchParam
    public Map<String, String> getParamSnapshot() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("1d6f777", new Object[]{this});
        }
        HashMap hashMap = new HashMap();
        for (Map.Entry<String, SearchParam.Param> entry : this.mMap.entrySet()) {
            String key = entry.getKey();
            SearchParam.Param value = entry.getValue();
            if (!TextUtils.isEmpty(key) && value != null) {
                hashMap.put(key, value.toUrlParamString());
            }
        }
        return hashMap;
    }

    @Override // com.taobao.android.searchbaseframe.datasource.param.SearchParam
    public String getParamStr(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7e304915", new Object[]{this, str});
        }
        SearchParam.Param param = this.mMap.get(str);
        if (param == null) {
            return "";
        }
        return param.toUrlParamString();
    }

    @Override // com.taobao.android.searchbaseframe.datasource.param.SearchParam
    public String getParamValue(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ea5b9c15", new Object[]{this, str});
        }
        SearchParam.Param param = this.mMap.get(str);
        if (param == null) {
            return null;
        }
        return param.getValue();
    }

    @Override // com.taobao.android.searchbaseframe.datasource.param.SearchParam
    public Set<String> getParamValueSet(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Set) ipChange.ipc$dispatch("a85e1de8", new Object[]{this, str});
        }
        SearchParam.Param param = this.mMap.get(str);
        if (param == null) {
            return null;
        }
        return param.getValueSet();
    }

    @Override // com.taobao.android.searchbaseframe.datasource.param.SearchParam
    public Map<String, SearchParam.Param> getParams() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("f10013f8", new Object[]{this});
        }
        return this.mMap;
    }

    @Override // com.taobao.android.searchbaseframe.datasource.param.SearchParam
    public void removeAllParams() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("323f96a", new Object[]{this});
        } else {
            this.mMap.clear();
        }
    }

    @Override // com.taobao.android.searchbaseframe.datasource.param.SearchParam
    public void removeParam(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6922783a", new Object[]{this, str});
        } else if (str != null) {
            this.mMap.remove(str);
        }
    }

    @Override // com.taobao.android.searchbaseframe.datasource.param.SearchParam
    public void removeParamSetValue(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f14249d3", new Object[]{this, str, str2});
        } else {
            ensureParam(str).removeSetValue(str2);
        }
    }

    @Override // com.taobao.android.searchbaseframe.datasource.param.SearchParam
    public void removeParams(Collection<String> collection) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d4518da2", new Object[]{this, collection});
        } else if (collection != null) {
            for (String str : collection) {
                if (str != null) {
                    this.mMap.remove(str);
                }
            }
        }
    }

    @Override // com.taobao.android.searchbaseframe.datasource.param.SearchParam
    public void setParam(String str, SearchParam.Param param) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cbdf8c95", new Object[]{this, str, param});
        } else {
            this.mMap.put(str, param);
        }
    }

    @Override // com.taobao.android.searchbaseframe.datasource.param.SearchParam
    public void setParams(Map<String, SearchParam.Param> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("70906a96", new Object[]{this, map});
            return;
        }
        this.mMap.clear();
        if (map != null) {
            this.mMap.putAll(map);
        }
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return JSON.toJSONString(createUrlParams());
    }

    @Override // com.taobao.android.searchbaseframe.datasource.param.SearchParam
    public void setParam(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dc6ab466", new Object[]{this, str, str2});
        } else {
            ensureParam(str).setValue(str2);
        }
    }

    @Override // com.taobao.android.searchbaseframe.datasource.param.SearchParam
    public void setParam(String str, Collection<String> collection) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("75b1aa4d", new Object[]{this, str, collection});
        } else {
            ensureParam(str).setValueSet(collection == null ? null : new HashSet(collection));
        }
    }
}
