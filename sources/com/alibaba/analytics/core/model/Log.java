package com.alibaba.analytics.core.model;

import android.text.TextUtils;
import com.alibaba.analytics.core.db.annotation.Column;
import com.alibaba.analytics.core.db.annotation.Ingore;
import com.alibaba.analytics.core.db.annotation.TableName;
import com.alibaba.analytics.core.logbuilder.a;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import tb.cfh;
import tb.ds3;
import tb.enx;
import tb.hsq;
import tb.iqq;
import tb.nhh;
import tb.o9n;
import tb.oeh;
import tb.p9n;
import tb.rf8;
import tb.t2o;
import tb.tp1;
import tb.vep;

/* compiled from: Taobao */
@TableName("log")
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class Log extends rf8 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    @Ingore
    public static final String DEFAULT_PRIORITY = "3";
    @Ingore
    public static final String FIELD_NAME_PRIORITY = "priority";
    @Ingore
    public static final String FIELD_NAME_TIME = "time";
    @Column(enx.INDEX_KEY)
    public String _index;
    @Column("content")
    private String content;
    @Column("content2")
    private String content2;
    @Column("eventId")
    public String eventId;
    @Column("priority")
    public String priority;
    @Column("streamId")
    public String streamId;
    @Column("time")
    public String time;
    @Ingore
    private int topicId;

    static {
        t2o.a(962592900);
    }

    public Log() {
        this.priority = "3";
        this.time = null;
        this._index = "";
        this.topicId = 0;
    }

    public static /* synthetic */ Object ipc$super(Log log, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/analytics/core/model/Log");
    }

    private void setContentPrivate(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2bb758d2", new Object[]{this, map});
        } else if (ds3.d().e()) {
            this.content2 = a.b(map, true);
        } else {
            setContent(a.a(map));
        }
    }

    @Deprecated
    public void buildLogContent() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c817a0aa", new Object[]{this});
        }
    }

    @Deprecated
    public String getCipherContent() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("45cc31c1", new Object[]{this});
        }
        return "";
    }

    @Deprecated
    public String getContent() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f1ec9696", new Object[]{this});
        }
        if (hsq.h(this.content2)) {
            StringBuilder c = iqq.a().c();
            c.append(this.content2);
            p9n.d(c);
            String sb = c.toString();
            iqq.a().b(c);
            return sb;
        } else if (!hsq.h(this.content)) {
            return null;
        } else {
            try {
                return new String(o9n.c(tp1.c(this.content.getBytes("UTF-8"))));
            } catch (Exception unused) {
                return null;
            }
        }
    }

    public int getContentForStringBuilder(StringBuilder sb) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1401d193", new Object[]{this, sb})).intValue();
        }
        return getContentForStringBuilderWithDebug(sb, false);
    }

    @Deprecated
    public String getPlus80WLogContent() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("fb6ddf35", new Object[]{this});
        }
        return "";
    }

    public int getTopicId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("adccacee", new Object[]{this})).intValue();
        }
        return this.topicId;
    }

    @Deprecated
    public void setCipherContent(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a859e83d", new Object[]{this, str});
        }
    }

    public void setContent(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("52a9c508", new Object[]{this, str});
        } else if (str != null) {
            try {
                this.content = new String(tp1.f(o9n.c(str.getBytes())), "UTF-8");
            } catch (UnsupportedEncodingException unused) {
            }
        }
    }

    public void setTopicId(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("42126074", new Object[]{this, new Integer(i)});
        } else {
            this.topicId = i;
        }
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "Log [eventId=" + this.eventId + ", index=" + this._index + "]";
    }

    private String buildStreamId(List<String> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d0eea47f", new Object[]{this, list});
        }
        if (list == null) {
            return "";
        }
        if (list.size() == 1) {
            return list.get(0);
        }
        StringBuilder c = iqq.a().c();
        for (int i = 0; i < list.size(); i++) {
            if (i > 0) {
                c.append(",");
            }
            c.append(list.get(i));
        }
        String sb = c.toString();
        iqq.a().b(c);
        return sb;
    }

    public int getContentForStringBuilderWithDebug(StringBuilder sb, boolean z) {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1cdf7b2c", new Object[]{this, sb, new Boolean(z)})).intValue();
        }
        if (sb == null) {
            return 0;
        }
        if (hsq.h(this.content2)) {
            StringBuilder c = iqq.a().c();
            c.append(this.content2);
            char[] d = p9n.d(c);
            if (d != null) {
                i = c.length();
                sb.append(d, 0, i);
            } else {
                i = 0;
            }
            if (z) {
                nhh.f("", "content2");
            }
            iqq.a().b(c);
            return i;
        } else if (!hsq.h(this.content)) {
            return 0;
        } else {
            try {
                String str = new String(o9n.c(tp1.c(this.content.getBytes("UTF-8"))));
                int length = str.length();
                if (z) {
                    try {
                        nhh.f("", "content");
                    } catch (Exception unused) {
                        return length;
                    }
                }
                sb.append(str);
                return length;
            } catch (Exception unused2) {
                return 0;
            }
        }
    }

    public Log(String str, List<String> list, String str2, Map<String, String> map) {
        this.time = null;
        this._index = "";
        this.topicId = 0;
        this.priority = str;
        this.streamId = buildStreamId(list);
        this.eventId = str2;
        this.time = String.valueOf(System.currentTimeMillis());
        vep.a().f(str2, map);
        this._index = map.get(oeh.RESERVE3);
        setContentPrivate(map);
    }

    public Log(String str, String str2, String str3, String str4, String str5, Map<String, String> map) {
        this.priority = "3";
        this.time = null;
        this._index = "";
        this.topicId = 0;
        this.eventId = str2;
        this.time = String.valueOf(System.currentTimeMillis());
        this.priority = cfh.c().d(str2);
        HashMap hashMap = new HashMap();
        if (map != null) {
            hashMap.putAll(map);
        }
        if (!TextUtils.isEmpty(str)) {
            hashMap.put("PAGE", str);
        }
        hashMap.put(oeh.EVENTID, str2);
        if (!TextUtils.isEmpty(str3)) {
            hashMap.put(oeh.ARG1, str3);
        }
        if (!TextUtils.isEmpty(str4)) {
            hashMap.put(oeh.ARG2, str4);
        }
        if (!TextUtils.isEmpty(str5)) {
            hashMap.put(oeh.ARG3, str5);
        }
        if (!TextUtils.isEmpty(this.time)) {
            hashMap.put(oeh.RECORD_TIMESTAMP, this.time);
        }
        vep.a().f(str2, hashMap);
        this._index = (String) hashMap.get(oeh.RESERVE3);
        setContentPrivate(hashMap);
    }
}
