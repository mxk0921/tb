package com.alibaba.security.wukong.model;

import android.text.TextUtils;
import com.alibaba.security.wukong.model.meta.Data;
import com.alibaba.security.wukong.model.meta.Text;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class TextRiskSample extends CCRCRiskSample {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public Text mText;

    public TextRiskSample(String str, String str2) {
        super(str);
        this.mText = new Text(str2);
    }

    public static /* synthetic */ Object ipc$super(TextRiskSample textRiskSample, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/security/wukong/model/TextRiskSample");
    }

    @Override // com.alibaba.security.wukong.model.CCRCRiskSample
    public String getMetaType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3168d9c4", new Object[]{this});
        }
        return "text";
    }

    @Override // com.alibaba.security.wukong.model.CCRCRiskSample
    public Data getRawData() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Data) ipChange.ipc$dispatch("b1c4156c", new Object[]{this});
        }
        return this.mText;
    }

    public Text getText() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Text) ipChange.ipc$dispatch("6d7a1030", new Object[]{this});
        }
        return this.mText;
    }

    @Override // com.alibaba.security.wukong.model.CCRCRiskSample
    public long getTs() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("31735e70", new Object[]{this})).longValue();
        }
        return this.mText.getTs();
    }

    @Override // com.alibaba.security.wukong.model.CCRCRiskSample
    public boolean isValid() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3fef87d", new Object[]{this})).booleanValue();
        }
        Text text = this.mText;
        if (text == null || TextUtils.isEmpty(text.getContent())) {
            return false;
        }
        return true;
    }

    public void setText(Text text) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("df242660", new Object[]{this, text});
        } else {
            this.mText = text;
        }
    }

    public TextRiskSample(String str, Map<String, Object> map, String str2) {
        super(str, map);
        this.mText = new Text(str2);
        getExtras().putAll(map);
    }

    public TextRiskSample(String str, Text text) {
        super(str);
        this.mText = text;
        getExtras().putAll(text.getExtras());
    }

    public TextRiskSample(String str, Map<String, Object> map, Text text) {
        super(str, map);
        this.mText = text;
        getExtras().putAll(text.getExtras());
    }
}
