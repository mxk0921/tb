package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Stack;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class fq8 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final Pattern d = Pattern.compile(">=|<=|!=|==|[-\\+\\*/\\(\\)!><]|~|&&|\\|\\||\\?|:");
    public static final Map<String, Integer> e;

    /* renamed from: a  reason: collision with root package name */
    public List<String> f19465a;
    public final String b;
    public final Map<String, Object> c;

    public fq8(String str) {
        this(str, null);
    }

    public Object a() {
        Object obj;
        Object obj2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("28b3ae92", new Object[]{this});
        }
        this.f19465a = c();
        Stack stack = new Stack();
        for (String str : this.f19465a) {
            if (!f(str)) {
                stack.push(str);
            } else {
                try {
                    if (str.equals(f7l.AND_NOT)) {
                        stack.push(yq8.c(d((String) stack.pop()), str).toString());
                    } else if (str.equals("?:")) {
                        stack.push(yq8.a(d((String) stack.pop()), d((String) stack.pop()), d((String) stack.pop()), str).toString());
                    } else {
                        try {
                            obj = d((String) stack.pop());
                        } catch (EmptyStackException unused) {
                            obj = "";
                        }
                        try {
                            obj2 = d((String) stack.pop());
                        } catch (EmptyStackException unused2) {
                            obj2 = "";
                        }
                        stack.push(yq8.b(obj2, obj, str).toString());
                    }
                } catch (EmptyStackException unused3) {
                    throw new RuntimeException("Invalid expression: " + this.b);
                }
            }
        }
        if (stack.size() == 1) {
            return d((String) stack.pop());
        }
        throw new RuntimeException("invalid expression:  '" + this.b + "'");
    }

    public synchronized Object b(Object obj) {
        Object obj2;
        Object obj3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("e9d6da36", new Object[]{this, obj});
        }
        if (this.f19465a == null) {
            this.f19465a = c();
        }
        Stack stack = new Stack();
        for (String str : this.f19465a) {
            if (!f(str)) {
                stack.push(str);
            } else {
                try {
                    if (str.equals(f7l.AND_NOT)) {
                        stack.push(yq8.c(d((String) stack.pop()), str).toString());
                    } else if (str.equals("?:")) {
                        stack.push(yq8.a(d((String) stack.pop()), d((String) stack.pop()), d((String) stack.pop()), str).toString());
                    } else {
                        try {
                            obj2 = d((String) stack.pop());
                        } catch (EmptyStackException unused) {
                            obj2 = "";
                        }
                        try {
                            obj3 = d((String) stack.pop());
                        } catch (EmptyStackException unused2) {
                            obj3 = "";
                        }
                        if (obj != null) {
                            if (obj3.equals(".")) {
                                obj3 = obj;
                            } else if (obj instanceof JSONObject) {
                                obj3 = lp6.a((JSONObject) obj, obj3.toString());
                            } else {
                                tfs.i("Expression", "expression left is wrong " + obj3);
                            }
                            if (obj3 instanceof String) {
                                String obj4 = obj2.toString();
                                if (obj4.startsWith("'") && obj4.endsWith("'")) {
                                    obj3 = "'" + obj3 + "'";
                                }
                            }
                        }
                        stack.push(yq8.b(obj3, obj2, str).toString());
                    }
                } catch (EmptyStackException unused3) {
                    throw new RuntimeException("Invalid expression: " + this.b);
                }
            }
        }
        if (stack.size() == 1) {
            return d((String) stack.pop());
        }
        throw new RuntimeException("invalid expression:  '" + this.b + "'");
    }

    public final List<String> c() {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("8faa7ec0", new Object[]{this});
        }
        Matcher matcher = d.matcher(this.b);
        Stack stack = new Stack();
        ArrayList arrayList = new ArrayList();
        while (matcher.find()) {
            String group = matcher.group();
            if (i < matcher.start()) {
                arrayList.add(this.b.substring(i, matcher.start()));
            }
            if (group.equals(f7l.BRACKET_START_STR)) {
                stack.push(group);
            } else if (group.equals(f7l.BRACKET_END_STR)) {
                while (!stack.isEmpty() && !((String) stack.peek()).equals(f7l.BRACKET_START_STR)) {
                    arrayList.add(stack.pop());
                }
                if (stack.isEmpty() || !((String) stack.peek()).equals(f7l.BRACKET_START_STR)) {
                    throw new RuntimeException("Invalid expression, miss \"(\" in : " + this.b);
                }
                stack.pop();
            } else if (group.equals(":")) {
                while (!stack.isEmpty() && !((String) stack.peek()).equals("?")) {
                    arrayList.add(stack.pop());
                }
                if (stack.isEmpty() || !((String) stack.peek()).equals("?")) {
                    throw new RuntimeException("Invalid expression, invalid \":\", miss \"?\" in : " + this.b);
                }
                stack.push(((String) stack.pop()) + group);
            } else {
                while (!stack.isEmpty() && !((String) stack.peek()).equals(f7l.BRACKET_START_STR) && (g((String) stack.peek()) < g(group) || (e((String) stack.peek()) && g((String) stack.peek()) == g(group)))) {
                    arrayList.add(stack.pop());
                }
                stack.push(group);
            }
            i = matcher.end();
        }
        if (i < this.b.length()) {
            String str = this.b;
            arrayList.add(str.substring(i, str.length()));
        }
        while (!stack.isEmpty()) {
            if (((String) stack.peek()).equals(f7l.BRACKET_START_STR) || ((String) stack.peek()).equals(f7l.BRACKET_END_STR)) {
                throw new RuntimeException("Invalid expression, with unknown \"(\" or \"）\" in : " + this.b);
            } else if (((String) stack.peek()).equals("?") || ((String) stack.peek()).equals(":")) {
                throw new RuntimeException("Invalid expression, with unknown \"(\" or \"）\" in : " + this.b);
            } else {
                arrayList.add(stack.pop());
            }
        }
        return arrayList;
    }

    public final Object d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("b1ed0ca6", new Object[]{this, str});
        }
        try {
            return Float.valueOf(str);
        } catch (NumberFormatException unused) {
            if (str.equalsIgnoreCase("true") || str.equalsIgnoreCase("false")) {
                return Boolean.valueOf(Boolean.parseBoolean(str));
            }
            Map<String, Object> map = this.c;
            if (map == null || !map.containsKey(str)) {
                return str;
            }
            try {
                if (this.c.get(str) != null) {
                    return Float.valueOf(this.c.get(str).toString());
                }
            } catch (NumberFormatException unused2) {
            }
            return this.c.get(str);
        }
    }

    public final boolean e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("24b166d5", new Object[]{this, str})).booleanValue();
        }
        if (str.equals(f7l.AND_NOT) || str.equals("?:")) {
            return false;
        }
        return true;
    }

    public final boolean f(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d0044403", new Object[]{this, str})).booleanValue();
        }
        return ((HashMap) e).containsKey(str);
    }

    public final int g(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("74992128", new Object[]{this, str})).intValue();
        }
        return ((Integer) ((HashMap) e).get(str)).intValue();
    }

    public fq8(String str, Map<String, Object> map) {
        this.b = str.replace(" ", "");
        this.c = map;
    }

    static {
        t2o.a(503317238);
        HashMap hashMap = new HashMap();
        e = hashMap;
        hashMap.put(f7l.BRACKET_START_STR, 1);
        hashMap.put(f7l.BRACKET_END_STR, 1);
        hashMap.put(f7l.AND_NOT, 2);
        hashMap.put("*", 3);
        hashMap.put("/", 3);
        hashMap.put(f7l.PLUS, 4);
        hashMap.put("-", 4);
        hashMap.put(">", 6);
        hashMap.put(">=", 6);
        hashMap.put("<", 6);
        hashMap.put("<=", 6);
        hashMap.put("==", 7);
        hashMap.put("!=", 7);
        hashMap.put("&&", 11);
        hashMap.put("||", 12);
        hashMap.put("?", 13);
        hashMap.put("?:", 13);
    }
}
