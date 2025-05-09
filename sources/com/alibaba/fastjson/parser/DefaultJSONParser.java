package com.alibaba.fastjson.parser;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.parser.deserializer.ExtraProcessor;
import com.alibaba.fastjson.parser.deserializer.ExtraTypeProvider;
import com.alibaba.fastjson.parser.deserializer.FieldDeserializer;
import com.alibaba.fastjson.parser.deserializer.FieldTypeResolver;
import com.alibaba.fastjson.parser.deserializer.ObjectDeserializer;
import com.alibaba.fastjson.serializer.IntegerCodec;
import com.alibaba.fastjson.serializer.StringCodec;
import com.alibaba.fastjson.util.FieldInfo;
import com.alibaba.fastjson.util.TypeUtils;
import java.io.Closeable;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;
import tb.f7l;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class DefaultJSONParser implements Closeable {
    public static final int NONE = 0;
    public static final int NeedToResolve = 1;
    public static final int TypeNameRedirect = 2;
    public ParserConfig config;
    protected ParseContext contex;
    private ParseContext[] contextArray;
    private int contextArrayIndex;
    private DateFormat dateFormat;
    private String dateFormatPattern;
    protected List<ExtraProcessor> extraProcessors;
    protected List<ExtraTypeProvider> extraTypeProviders;
    public FieldTypeResolver fieldTypeResolver;
    public final JSONLexer lexer;
    public int resolveStatus;
    private List<ResolveTask> resolveTaskList;
    public final SymbolTable symbolTable;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class ResolveTask {
        private final ParseContext context;
        public FieldDeserializer fieldDeserializer;
        public ParseContext ownerContext;
        private final String referenceValue;

        public ResolveTask(ParseContext parseContext, String str) {
            this.context = parseContext;
            this.referenceValue = str;
        }
    }

    public DefaultJSONParser(String str) {
        this(str, ParserConfig.global, JSON.DEFAULT_PARSER_FEATURE);
    }

    public final void accept(int i) {
        JSONLexer jSONLexer = this.lexer;
        if (jSONLexer.token == i) {
            jSONLexer.nextToken();
            return;
        }
        throw new JSONException("syntax error, expect " + JSONToken.name(i) + ", actual " + JSONToken.name(this.lexer.token));
    }

    public void addResolveTask(ResolveTask resolveTask) {
        if (this.resolveTaskList == null) {
            this.resolveTaskList = new ArrayList(2);
        }
        this.resolveTaskList.add(resolveTask);
    }

    public void checkListResolve(Collection collection) {
        if (collection instanceof List) {
            ResolveTask lastResolveTask = getLastResolveTask();
            lastResolveTask.fieldDeserializer = new ResolveFieldDeserializer(this, (List) collection, collection.size() - 1);
            lastResolveTask.ownerContext = this.contex;
            this.resolveStatus = 0;
            return;
        }
        ResolveTask lastResolveTask2 = getLastResolveTask();
        lastResolveTask2.fieldDeserializer = new ResolveFieldDeserializer(collection);
        lastResolveTask2.ownerContext = this.contex;
        this.resolveStatus = 0;
    }

    public void checkMapResolve(Map map, Object obj) {
        ResolveFieldDeserializer resolveFieldDeserializer = new ResolveFieldDeserializer(map, obj);
        ResolveTask lastResolveTask = getLastResolveTask();
        lastResolveTask.fieldDeserializer = resolveFieldDeserializer;
        lastResolveTask.ownerContext = this.contex;
        this.resolveStatus = 0;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        try {
            JSONLexer jSONLexer = this.lexer;
            if (jSONLexer.token == 20) {
                jSONLexer.close();
                return;
            }
            throw new JSONException("not close json text, token : " + JSONToken.name(this.lexer.token));
        } catch (Throwable th) {
            this.lexer.close();
            throw th;
        }
    }

    public void config(Feature feature, boolean z) {
        this.lexer.config(feature, z);
    }

    public String getDateFomartPattern() {
        return this.dateFormatPattern;
    }

    public DateFormat getDateFormat() {
        if (this.dateFormat == null) {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat(this.dateFormatPattern, this.lexer.locale);
            this.dateFormat = simpleDateFormat;
            simpleDateFormat.setTimeZone(this.lexer.timeZone);
        }
        return this.dateFormat;
    }

    public List<ExtraProcessor> getExtraProcessors() {
        if (this.extraProcessors == null) {
            this.extraProcessors = new ArrayList(2);
        }
        return this.extraProcessors;
    }

    public List<ExtraTypeProvider> getExtraTypeProviders() {
        if (this.extraTypeProviders == null) {
            this.extraTypeProviders = new ArrayList(2);
        }
        return this.extraTypeProviders;
    }

    public ResolveTask getLastResolveTask() {
        List<ResolveTask> list = this.resolveTaskList;
        return list.get(list.size() - 1);
    }

    public void handleResovleTask(Object obj) {
        Object obj2;
        List<ResolveTask> list = this.resolveTaskList;
        if (list != null) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                ResolveTask resolveTask = this.resolveTaskList.get(i);
                FieldDeserializer fieldDeserializer = resolveTask.fieldDeserializer;
                if (fieldDeserializer != null) {
                    ParseContext parseContext = resolveTask.ownerContext;
                    Object obj3 = null;
                    if (parseContext != null) {
                        obj2 = parseContext.object;
                    } else {
                        obj2 = null;
                    }
                    String str = resolveTask.referenceValue;
                    if (str.startsWith("$")) {
                        for (int i2 = 0; i2 < this.contextArrayIndex; i2++) {
                            if (str.equals(this.contextArray[i2].toString())) {
                                obj3 = this.contextArray[i2].object;
                            }
                        }
                    } else {
                        obj3 = resolveTask.context.object;
                    }
                    fieldDeserializer.setValue(obj2, obj3);
                }
            }
        }
    }

    public Object parse() {
        return parse(null);
    }

    public <T> List<T> parseArray(Class<T> cls) {
        ArrayList arrayList = new ArrayList();
        parseArray((Class<?>) cls, (Collection) arrayList);
        return arrayList;
    }

    public Object parseArrayWithType(Type type) {
        JSONLexer jSONLexer = this.lexer;
        if (jSONLexer.token == 8) {
            jSONLexer.nextToken();
            return null;
        }
        Type[] actualTypeArguments = ((ParameterizedType) type).getActualTypeArguments();
        if (actualTypeArguments.length == 1) {
            Type type2 = actualTypeArguments[0];
            if (type2 instanceof Class) {
                ArrayList arrayList = new ArrayList();
                parseArray((Class) type2, (Collection) arrayList);
                return arrayList;
            } else if (type2 instanceof WildcardType) {
                WildcardType wildcardType = (WildcardType) type2;
                Type type3 = wildcardType.getUpperBounds()[0];
                if (!Object.class.equals(type3)) {
                    ArrayList arrayList2 = new ArrayList();
                    parseArray((Class) type3, (Collection) arrayList2);
                    return arrayList2;
                } else if (wildcardType.getLowerBounds().length == 0) {
                    return parse();
                } else {
                    throw new JSONException("not support type : " + type);
                }
            } else {
                if (type2 instanceof TypeVariable) {
                    TypeVariable typeVariable = (TypeVariable) type2;
                    Type[] bounds = typeVariable.getBounds();
                    if (bounds.length == 1) {
                        Type type4 = bounds[0];
                        if (type4 instanceof Class) {
                            ArrayList arrayList3 = new ArrayList();
                            parseArray((Class) type4, (Collection) arrayList3);
                            return arrayList3;
                        }
                    } else {
                        throw new JSONException("not support : " + typeVariable);
                    }
                }
                if (type2 instanceof ParameterizedType) {
                    ArrayList arrayList4 = new ArrayList();
                    parseArray((ParameterizedType) type2, arrayList4);
                    return arrayList4;
                }
                throw new JSONException("TODO : " + type);
            }
        } else {
            throw new JSONException("not support type " + type);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:130:0x0237, code lost:
        r4.nextToken(16);
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x023e, code lost:
        if (r4.token != 13) goto L_0x02ae;
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x0240, code lost:
        r4.nextToken(16);
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x0243, code lost:
        r2 = r19.config.getDeserializer(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x024b, code lost:
        if ((r2 instanceof com.alibaba.fastjson.parser.JavaBeanDeserializer) == false) goto L_0x0281;
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x024d, code lost:
        r2 = (com.alibaba.fastjson.parser.JavaBeanDeserializer) r2;
        r3 = r2.createInstance(r19, r7);
        r0 = r20.entrySet().iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x025f, code lost:
        if (r0.hasNext() == false) goto L_0x0282;
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x0261, code lost:
        r4 = (java.util.Map.Entry) r0.next();
        r5 = r4.getKey();
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x026d, code lost:
        if ((r5 instanceof java.lang.String) == false) goto L_0x025b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x026f, code lost:
        r5 = r2.getFieldDeserializer((java.lang.String) r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x0275, code lost:
        if (r5 == null) goto L_0x025b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x0277, code lost:
        r5.setValue(r3, r4.getValue());
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x027f, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x0281, code lost:
        r3 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x0282, code lost:
        if (r3 != null) goto L_0x02a0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x0286, code lost:
        if (r7 != java.lang.Cloneable.class) goto L_0x028e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x0288, code lost:
        r3 = new java.util.HashMap();
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x0295, code lost:
        if ("java.util.Collections$EmptyMap".equals(r6) == false) goto L_0x029c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x0297, code lost:
        r3 = java.util.Collections.emptyMap();
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x029c, code lost:
        r3 = r7.newInstance();
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x02a0, code lost:
        if (r14 != false) goto L_0x02a4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x02a2, code lost:
        r19.contex = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x02a4, code lost:
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x02ad, code lost:
        throw new com.alibaba.fastjson.JSONException("create instance error", r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x02ae, code lost:
        r19.resolveStatus = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x02b3, code lost:
        if (r19.contex == null) goto L_0x02bc;
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x02b7, code lost:
        if ((r21 instanceof java.lang.Integer) != false) goto L_0x02bc;
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x02b9, code lost:
        popContext();
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x02c0, code lost:
        if (r20.size() <= 0) goto L_0x02d0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x02c2, code lost:
        r0 = com.alibaba.fastjson.util.TypeUtils.cast((java.lang.Object) r20, (java.lang.Class<java.lang.Object>) r7, r19.config);
        parseObject(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:167:0x02cb, code lost:
        if (r14 != false) goto L_0x02cf;
     */
    /* JADX WARN: Code restructure failed: missing block: B:168:0x02cd, code lost:
        r19.contex = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:169:0x02cf, code lost:
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:170:0x02d0, code lost:
        r0 = r19.config.getDeserializer(r7).deserialze(r19, r7, r21);
     */
    /* JADX WARN: Code restructure failed: missing block: B:171:0x02da, code lost:
        if (r14 != false) goto L_0x02de;
     */
    /* JADX WARN: Code restructure failed: missing block: B:172:0x02dc, code lost:
        r19.contex = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:173:0x02de, code lost:
        return r0;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0204 A[Catch: all -> 0x0075, TryCatch #2 {all -> 0x0075, blocks: (B:20:0x0065, B:23:0x006f, B:28:0x007c, B:31:0x0091, B:33:0x009b, B:36:0x00a3, B:37:0x00c1, B:41:0x00c9, B:44:0x00d4, B:45:0x00da, B:51:0x00ed, B:53:0x00f7, B:54:0x00fa, B:57:0x00ff, B:58:0x0115, B:70:0x012c, B:71:0x0131, B:73:0x0136, B:74:0x013b, B:76:0x0143, B:77:0x0147, B:80:0x014d, B:81:0x0165, B:82:0x0166, B:83:0x017e, B:89:0x0188, B:92:0x0197, B:93:0x019d, B:94:0x01bb, B:95:0x01bc, B:98:0x01c8, B:101:0x01d5, B:102:0x01db, B:118:0x01fa, B:121:0x0204, B:122:0x0209, B:124:0x020f, B:126:0x0217, B:128:0x022a, B:130:0x0237, B:132:0x0240, B:133:0x0243, B:135:0x024d, B:136:0x025b, B:138:0x0261, B:140:0x026f, B:142:0x0277, B:149:0x0288, B:150:0x028e, B:152:0x0297, B:153:0x029c, B:157:0x02a5, B:158:0x02ad, B:159:0x02ae, B:161:0x02b5, B:163:0x02b9, B:164:0x02bc, B:166:0x02c2, B:170:0x02d0, B:177:0x02e6, B:179:0x02ee, B:181:0x02f5, B:183:0x0304, B:185:0x030c, B:188:0x0311, B:190:0x0315, B:191:0x0318, B:193:0x0320, B:196:0x0326, B:197:0x0332, B:200:0x033b, B:203:0x0341, B:206:0x0347, B:207:0x0353, B:209:0x035f, B:211:0x0363, B:215:0x036d, B:216:0x0385, B:217:0x0386, B:218:0x03a3, B:221:0x03a8, B:227:0x03ba, B:229:0x03c0, B:231:0x03cc, B:232:0x03d2, B:234:0x03d7, B:235:0x03db, B:243:0x03ee, B:246:0x03fa, B:249:0x040b, B:250:0x0411, B:252:0x041a, B:255:0x0423, B:256:0x0426, B:258:0x0430, B:259:0x0434, B:260:0x0437, B:262:0x043b, B:271:0x0451, B:272:0x0469, B:275:0x046e, B:278:0x047b, B:279:0x0481, B:281:0x0492, B:282:0x049d, B:285:0x04a6, B:287:0x04ac, B:290:0x04b2, B:292:0x04bc, B:294:0x04c4, B:298:0x04d6, B:301:0x04de, B:302:0x04e0, B:304:0x04e5, B:306:0x04ee, B:307:0x04f2, B:309:0x04f7, B:310:0x04fa, B:312:0x0500, B:314:0x0507, B:320:0x0514, B:321:0x052c, B:324:0x0533, B:326:0x0540, B:329:0x0553, B:331:0x0560, B:332:0x056d, B:336:0x0577, B:339:0x0580, B:342:0x058d, B:343:0x0593, B:346:0x059b, B:349:0x05a8, B:350:0x05ae, B:352:0x05b7, B:355:0x05c4, B:356:0x05ca, B:359:0x05d5, B:362:0x05e2, B:363:0x05e8, B:366:0x05f3, B:369:0x0600, B:370:0x0606, B:371:0x060d, B:373:0x0612, B:377:0x061c, B:378:0x0634, B:379:0x0635, B:381:0x0646, B:382:0x064a, B:384:0x0653, B:391:0x0665, B:392:0x067d, B:393:0x067e, B:394:0x0696, B:395:0x0697, B:396:0x06af), top: B:403:0x0065, inners: #0, #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:211:0x0363 A[Catch: all -> 0x0075, TRY_LEAVE, TryCatch #2 {all -> 0x0075, blocks: (B:20:0x0065, B:23:0x006f, B:28:0x007c, B:31:0x0091, B:33:0x009b, B:36:0x00a3, B:37:0x00c1, B:41:0x00c9, B:44:0x00d4, B:45:0x00da, B:51:0x00ed, B:53:0x00f7, B:54:0x00fa, B:57:0x00ff, B:58:0x0115, B:70:0x012c, B:71:0x0131, B:73:0x0136, B:74:0x013b, B:76:0x0143, B:77:0x0147, B:80:0x014d, B:81:0x0165, B:82:0x0166, B:83:0x017e, B:89:0x0188, B:92:0x0197, B:93:0x019d, B:94:0x01bb, B:95:0x01bc, B:98:0x01c8, B:101:0x01d5, B:102:0x01db, B:118:0x01fa, B:121:0x0204, B:122:0x0209, B:124:0x020f, B:126:0x0217, B:128:0x022a, B:130:0x0237, B:132:0x0240, B:133:0x0243, B:135:0x024d, B:136:0x025b, B:138:0x0261, B:140:0x026f, B:142:0x0277, B:149:0x0288, B:150:0x028e, B:152:0x0297, B:153:0x029c, B:157:0x02a5, B:158:0x02ad, B:159:0x02ae, B:161:0x02b5, B:163:0x02b9, B:164:0x02bc, B:166:0x02c2, B:170:0x02d0, B:177:0x02e6, B:179:0x02ee, B:181:0x02f5, B:183:0x0304, B:185:0x030c, B:188:0x0311, B:190:0x0315, B:191:0x0318, B:193:0x0320, B:196:0x0326, B:197:0x0332, B:200:0x033b, B:203:0x0341, B:206:0x0347, B:207:0x0353, B:209:0x035f, B:211:0x0363, B:215:0x036d, B:216:0x0385, B:217:0x0386, B:218:0x03a3, B:221:0x03a8, B:227:0x03ba, B:229:0x03c0, B:231:0x03cc, B:232:0x03d2, B:234:0x03d7, B:235:0x03db, B:243:0x03ee, B:246:0x03fa, B:249:0x040b, B:250:0x0411, B:252:0x041a, B:255:0x0423, B:256:0x0426, B:258:0x0430, B:259:0x0434, B:260:0x0437, B:262:0x043b, B:271:0x0451, B:272:0x0469, B:275:0x046e, B:278:0x047b, B:279:0x0481, B:281:0x0492, B:282:0x049d, B:285:0x04a6, B:287:0x04ac, B:290:0x04b2, B:292:0x04bc, B:294:0x04c4, B:298:0x04d6, B:301:0x04de, B:302:0x04e0, B:304:0x04e5, B:306:0x04ee, B:307:0x04f2, B:309:0x04f7, B:310:0x04fa, B:312:0x0500, B:314:0x0507, B:320:0x0514, B:321:0x052c, B:324:0x0533, B:326:0x0540, B:329:0x0553, B:331:0x0560, B:332:0x056d, B:336:0x0577, B:339:0x0580, B:342:0x058d, B:343:0x0593, B:346:0x059b, B:349:0x05a8, B:350:0x05ae, B:352:0x05b7, B:355:0x05c4, B:356:0x05ca, B:359:0x05d5, B:362:0x05e2, B:363:0x05e8, B:366:0x05f3, B:369:0x0600, B:370:0x0606, B:371:0x060d, B:373:0x0612, B:377:0x061c, B:378:0x0634, B:379:0x0635, B:381:0x0646, B:382:0x064a, B:384:0x0653, B:391:0x0665, B:392:0x067d, B:393:0x067e, B:394:0x0696, B:395:0x0697, B:396:0x06af), top: B:403:0x0065, inners: #0, #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:215:0x036d A[Catch: all -> 0x0075, TRY_ENTER, TryCatch #2 {all -> 0x0075, blocks: (B:20:0x0065, B:23:0x006f, B:28:0x007c, B:31:0x0091, B:33:0x009b, B:36:0x00a3, B:37:0x00c1, B:41:0x00c9, B:44:0x00d4, B:45:0x00da, B:51:0x00ed, B:53:0x00f7, B:54:0x00fa, B:57:0x00ff, B:58:0x0115, B:70:0x012c, B:71:0x0131, B:73:0x0136, B:74:0x013b, B:76:0x0143, B:77:0x0147, B:80:0x014d, B:81:0x0165, B:82:0x0166, B:83:0x017e, B:89:0x0188, B:92:0x0197, B:93:0x019d, B:94:0x01bb, B:95:0x01bc, B:98:0x01c8, B:101:0x01d5, B:102:0x01db, B:118:0x01fa, B:121:0x0204, B:122:0x0209, B:124:0x020f, B:126:0x0217, B:128:0x022a, B:130:0x0237, B:132:0x0240, B:133:0x0243, B:135:0x024d, B:136:0x025b, B:138:0x0261, B:140:0x026f, B:142:0x0277, B:149:0x0288, B:150:0x028e, B:152:0x0297, B:153:0x029c, B:157:0x02a5, B:158:0x02ad, B:159:0x02ae, B:161:0x02b5, B:163:0x02b9, B:164:0x02bc, B:166:0x02c2, B:170:0x02d0, B:177:0x02e6, B:179:0x02ee, B:181:0x02f5, B:183:0x0304, B:185:0x030c, B:188:0x0311, B:190:0x0315, B:191:0x0318, B:193:0x0320, B:196:0x0326, B:197:0x0332, B:200:0x033b, B:203:0x0341, B:206:0x0347, B:207:0x0353, B:209:0x035f, B:211:0x0363, B:215:0x036d, B:216:0x0385, B:217:0x0386, B:218:0x03a3, B:221:0x03a8, B:227:0x03ba, B:229:0x03c0, B:231:0x03cc, B:232:0x03d2, B:234:0x03d7, B:235:0x03db, B:243:0x03ee, B:246:0x03fa, B:249:0x040b, B:250:0x0411, B:252:0x041a, B:255:0x0423, B:256:0x0426, B:258:0x0430, B:259:0x0434, B:260:0x0437, B:262:0x043b, B:271:0x0451, B:272:0x0469, B:275:0x046e, B:278:0x047b, B:279:0x0481, B:281:0x0492, B:282:0x049d, B:285:0x04a6, B:287:0x04ac, B:290:0x04b2, B:292:0x04bc, B:294:0x04c4, B:298:0x04d6, B:301:0x04de, B:302:0x04e0, B:304:0x04e5, B:306:0x04ee, B:307:0x04f2, B:309:0x04f7, B:310:0x04fa, B:312:0x0500, B:314:0x0507, B:320:0x0514, B:321:0x052c, B:324:0x0533, B:326:0x0540, B:329:0x0553, B:331:0x0560, B:332:0x056d, B:336:0x0577, B:339:0x0580, B:342:0x058d, B:343:0x0593, B:346:0x059b, B:349:0x05a8, B:350:0x05ae, B:352:0x05b7, B:355:0x05c4, B:356:0x05ca, B:359:0x05d5, B:362:0x05e2, B:363:0x05e8, B:366:0x05f3, B:369:0x0600, B:370:0x0606, B:371:0x060d, B:373:0x0612, B:377:0x061c, B:378:0x0634, B:379:0x0635, B:381:0x0646, B:382:0x064a, B:384:0x0653, B:391:0x0665, B:392:0x067d, B:393:0x067e, B:394:0x0696, B:395:0x0697, B:396:0x06af), top: B:403:0x0065, inners: #0, #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:227:0x03ba A[Catch: all -> 0x0075, TryCatch #2 {all -> 0x0075, blocks: (B:20:0x0065, B:23:0x006f, B:28:0x007c, B:31:0x0091, B:33:0x009b, B:36:0x00a3, B:37:0x00c1, B:41:0x00c9, B:44:0x00d4, B:45:0x00da, B:51:0x00ed, B:53:0x00f7, B:54:0x00fa, B:57:0x00ff, B:58:0x0115, B:70:0x012c, B:71:0x0131, B:73:0x0136, B:74:0x013b, B:76:0x0143, B:77:0x0147, B:80:0x014d, B:81:0x0165, B:82:0x0166, B:83:0x017e, B:89:0x0188, B:92:0x0197, B:93:0x019d, B:94:0x01bb, B:95:0x01bc, B:98:0x01c8, B:101:0x01d5, B:102:0x01db, B:118:0x01fa, B:121:0x0204, B:122:0x0209, B:124:0x020f, B:126:0x0217, B:128:0x022a, B:130:0x0237, B:132:0x0240, B:133:0x0243, B:135:0x024d, B:136:0x025b, B:138:0x0261, B:140:0x026f, B:142:0x0277, B:149:0x0288, B:150:0x028e, B:152:0x0297, B:153:0x029c, B:157:0x02a5, B:158:0x02ad, B:159:0x02ae, B:161:0x02b5, B:163:0x02b9, B:164:0x02bc, B:166:0x02c2, B:170:0x02d0, B:177:0x02e6, B:179:0x02ee, B:181:0x02f5, B:183:0x0304, B:185:0x030c, B:188:0x0311, B:190:0x0315, B:191:0x0318, B:193:0x0320, B:196:0x0326, B:197:0x0332, B:200:0x033b, B:203:0x0341, B:206:0x0347, B:207:0x0353, B:209:0x035f, B:211:0x0363, B:215:0x036d, B:216:0x0385, B:217:0x0386, B:218:0x03a3, B:221:0x03a8, B:227:0x03ba, B:229:0x03c0, B:231:0x03cc, B:232:0x03d2, B:234:0x03d7, B:235:0x03db, B:243:0x03ee, B:246:0x03fa, B:249:0x040b, B:250:0x0411, B:252:0x041a, B:255:0x0423, B:256:0x0426, B:258:0x0430, B:259:0x0434, B:260:0x0437, B:262:0x043b, B:271:0x0451, B:272:0x0469, B:275:0x046e, B:278:0x047b, B:279:0x0481, B:281:0x0492, B:282:0x049d, B:285:0x04a6, B:287:0x04ac, B:290:0x04b2, B:292:0x04bc, B:294:0x04c4, B:298:0x04d6, B:301:0x04de, B:302:0x04e0, B:304:0x04e5, B:306:0x04ee, B:307:0x04f2, B:309:0x04f7, B:310:0x04fa, B:312:0x0500, B:314:0x0507, B:320:0x0514, B:321:0x052c, B:324:0x0533, B:326:0x0540, B:329:0x0553, B:331:0x0560, B:332:0x056d, B:336:0x0577, B:339:0x0580, B:342:0x058d, B:343:0x0593, B:346:0x059b, B:349:0x05a8, B:350:0x05ae, B:352:0x05b7, B:355:0x05c4, B:356:0x05ca, B:359:0x05d5, B:362:0x05e2, B:363:0x05e8, B:366:0x05f3, B:369:0x0600, B:370:0x0606, B:371:0x060d, B:373:0x0612, B:377:0x061c, B:378:0x0634, B:379:0x0635, B:381:0x0646, B:382:0x064a, B:384:0x0653, B:391:0x0665, B:392:0x067d, B:393:0x067e, B:394:0x0696, B:395:0x0697, B:396:0x06af), top: B:403:0x0065, inners: #0, #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:237:0x03e2  */
    /* JADX WARN: Removed duplicated region for block: B:298:0x04d6 A[Catch: all -> 0x0075, TryCatch #2 {all -> 0x0075, blocks: (B:20:0x0065, B:23:0x006f, B:28:0x007c, B:31:0x0091, B:33:0x009b, B:36:0x00a3, B:37:0x00c1, B:41:0x00c9, B:44:0x00d4, B:45:0x00da, B:51:0x00ed, B:53:0x00f7, B:54:0x00fa, B:57:0x00ff, B:58:0x0115, B:70:0x012c, B:71:0x0131, B:73:0x0136, B:74:0x013b, B:76:0x0143, B:77:0x0147, B:80:0x014d, B:81:0x0165, B:82:0x0166, B:83:0x017e, B:89:0x0188, B:92:0x0197, B:93:0x019d, B:94:0x01bb, B:95:0x01bc, B:98:0x01c8, B:101:0x01d5, B:102:0x01db, B:118:0x01fa, B:121:0x0204, B:122:0x0209, B:124:0x020f, B:126:0x0217, B:128:0x022a, B:130:0x0237, B:132:0x0240, B:133:0x0243, B:135:0x024d, B:136:0x025b, B:138:0x0261, B:140:0x026f, B:142:0x0277, B:149:0x0288, B:150:0x028e, B:152:0x0297, B:153:0x029c, B:157:0x02a5, B:158:0x02ad, B:159:0x02ae, B:161:0x02b5, B:163:0x02b9, B:164:0x02bc, B:166:0x02c2, B:170:0x02d0, B:177:0x02e6, B:179:0x02ee, B:181:0x02f5, B:183:0x0304, B:185:0x030c, B:188:0x0311, B:190:0x0315, B:191:0x0318, B:193:0x0320, B:196:0x0326, B:197:0x0332, B:200:0x033b, B:203:0x0341, B:206:0x0347, B:207:0x0353, B:209:0x035f, B:211:0x0363, B:215:0x036d, B:216:0x0385, B:217:0x0386, B:218:0x03a3, B:221:0x03a8, B:227:0x03ba, B:229:0x03c0, B:231:0x03cc, B:232:0x03d2, B:234:0x03d7, B:235:0x03db, B:243:0x03ee, B:246:0x03fa, B:249:0x040b, B:250:0x0411, B:252:0x041a, B:255:0x0423, B:256:0x0426, B:258:0x0430, B:259:0x0434, B:260:0x0437, B:262:0x043b, B:271:0x0451, B:272:0x0469, B:275:0x046e, B:278:0x047b, B:279:0x0481, B:281:0x0492, B:282:0x049d, B:285:0x04a6, B:287:0x04ac, B:290:0x04b2, B:292:0x04bc, B:294:0x04c4, B:298:0x04d6, B:301:0x04de, B:302:0x04e0, B:304:0x04e5, B:306:0x04ee, B:307:0x04f2, B:309:0x04f7, B:310:0x04fa, B:312:0x0500, B:314:0x0507, B:320:0x0514, B:321:0x052c, B:324:0x0533, B:326:0x0540, B:329:0x0553, B:331:0x0560, B:332:0x056d, B:336:0x0577, B:339:0x0580, B:342:0x058d, B:343:0x0593, B:346:0x059b, B:349:0x05a8, B:350:0x05ae, B:352:0x05b7, B:355:0x05c4, B:356:0x05ca, B:359:0x05d5, B:362:0x05e2, B:363:0x05e8, B:366:0x05f3, B:369:0x0600, B:370:0x0606, B:371:0x060d, B:373:0x0612, B:377:0x061c, B:378:0x0634, B:379:0x0635, B:381:0x0646, B:382:0x064a, B:384:0x0653, B:391:0x0665, B:392:0x067d, B:393:0x067e, B:394:0x0696, B:395:0x0697, B:396:0x06af), top: B:403:0x0065, inners: #0, #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:304:0x04e5 A[Catch: all -> 0x0075, TryCatch #2 {all -> 0x0075, blocks: (B:20:0x0065, B:23:0x006f, B:28:0x007c, B:31:0x0091, B:33:0x009b, B:36:0x00a3, B:37:0x00c1, B:41:0x00c9, B:44:0x00d4, B:45:0x00da, B:51:0x00ed, B:53:0x00f7, B:54:0x00fa, B:57:0x00ff, B:58:0x0115, B:70:0x012c, B:71:0x0131, B:73:0x0136, B:74:0x013b, B:76:0x0143, B:77:0x0147, B:80:0x014d, B:81:0x0165, B:82:0x0166, B:83:0x017e, B:89:0x0188, B:92:0x0197, B:93:0x019d, B:94:0x01bb, B:95:0x01bc, B:98:0x01c8, B:101:0x01d5, B:102:0x01db, B:118:0x01fa, B:121:0x0204, B:122:0x0209, B:124:0x020f, B:126:0x0217, B:128:0x022a, B:130:0x0237, B:132:0x0240, B:133:0x0243, B:135:0x024d, B:136:0x025b, B:138:0x0261, B:140:0x026f, B:142:0x0277, B:149:0x0288, B:150:0x028e, B:152:0x0297, B:153:0x029c, B:157:0x02a5, B:158:0x02ad, B:159:0x02ae, B:161:0x02b5, B:163:0x02b9, B:164:0x02bc, B:166:0x02c2, B:170:0x02d0, B:177:0x02e6, B:179:0x02ee, B:181:0x02f5, B:183:0x0304, B:185:0x030c, B:188:0x0311, B:190:0x0315, B:191:0x0318, B:193:0x0320, B:196:0x0326, B:197:0x0332, B:200:0x033b, B:203:0x0341, B:206:0x0347, B:207:0x0353, B:209:0x035f, B:211:0x0363, B:215:0x036d, B:216:0x0385, B:217:0x0386, B:218:0x03a3, B:221:0x03a8, B:227:0x03ba, B:229:0x03c0, B:231:0x03cc, B:232:0x03d2, B:234:0x03d7, B:235:0x03db, B:243:0x03ee, B:246:0x03fa, B:249:0x040b, B:250:0x0411, B:252:0x041a, B:255:0x0423, B:256:0x0426, B:258:0x0430, B:259:0x0434, B:260:0x0437, B:262:0x043b, B:271:0x0451, B:272:0x0469, B:275:0x046e, B:278:0x047b, B:279:0x0481, B:281:0x0492, B:282:0x049d, B:285:0x04a6, B:287:0x04ac, B:290:0x04b2, B:292:0x04bc, B:294:0x04c4, B:298:0x04d6, B:301:0x04de, B:302:0x04e0, B:304:0x04e5, B:306:0x04ee, B:307:0x04f2, B:309:0x04f7, B:310:0x04fa, B:312:0x0500, B:314:0x0507, B:320:0x0514, B:321:0x052c, B:324:0x0533, B:326:0x0540, B:329:0x0553, B:331:0x0560, B:332:0x056d, B:336:0x0577, B:339:0x0580, B:342:0x058d, B:343:0x0593, B:346:0x059b, B:349:0x05a8, B:350:0x05ae, B:352:0x05b7, B:355:0x05c4, B:356:0x05ca, B:359:0x05d5, B:362:0x05e2, B:363:0x05e8, B:366:0x05f3, B:369:0x0600, B:370:0x0606, B:371:0x060d, B:373:0x0612, B:377:0x061c, B:378:0x0634, B:379:0x0635, B:381:0x0646, B:382:0x064a, B:384:0x0653, B:391:0x0665, B:392:0x067d, B:393:0x067e, B:394:0x0696, B:395:0x0697, B:396:0x06af), top: B:403:0x0065, inners: #0, #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:306:0x04ee A[Catch: all -> 0x0075, TryCatch #2 {all -> 0x0075, blocks: (B:20:0x0065, B:23:0x006f, B:28:0x007c, B:31:0x0091, B:33:0x009b, B:36:0x00a3, B:37:0x00c1, B:41:0x00c9, B:44:0x00d4, B:45:0x00da, B:51:0x00ed, B:53:0x00f7, B:54:0x00fa, B:57:0x00ff, B:58:0x0115, B:70:0x012c, B:71:0x0131, B:73:0x0136, B:74:0x013b, B:76:0x0143, B:77:0x0147, B:80:0x014d, B:81:0x0165, B:82:0x0166, B:83:0x017e, B:89:0x0188, B:92:0x0197, B:93:0x019d, B:94:0x01bb, B:95:0x01bc, B:98:0x01c8, B:101:0x01d5, B:102:0x01db, B:118:0x01fa, B:121:0x0204, B:122:0x0209, B:124:0x020f, B:126:0x0217, B:128:0x022a, B:130:0x0237, B:132:0x0240, B:133:0x0243, B:135:0x024d, B:136:0x025b, B:138:0x0261, B:140:0x026f, B:142:0x0277, B:149:0x0288, B:150:0x028e, B:152:0x0297, B:153:0x029c, B:157:0x02a5, B:158:0x02ad, B:159:0x02ae, B:161:0x02b5, B:163:0x02b9, B:164:0x02bc, B:166:0x02c2, B:170:0x02d0, B:177:0x02e6, B:179:0x02ee, B:181:0x02f5, B:183:0x0304, B:185:0x030c, B:188:0x0311, B:190:0x0315, B:191:0x0318, B:193:0x0320, B:196:0x0326, B:197:0x0332, B:200:0x033b, B:203:0x0341, B:206:0x0347, B:207:0x0353, B:209:0x035f, B:211:0x0363, B:215:0x036d, B:216:0x0385, B:217:0x0386, B:218:0x03a3, B:221:0x03a8, B:227:0x03ba, B:229:0x03c0, B:231:0x03cc, B:232:0x03d2, B:234:0x03d7, B:235:0x03db, B:243:0x03ee, B:246:0x03fa, B:249:0x040b, B:250:0x0411, B:252:0x041a, B:255:0x0423, B:256:0x0426, B:258:0x0430, B:259:0x0434, B:260:0x0437, B:262:0x043b, B:271:0x0451, B:272:0x0469, B:275:0x046e, B:278:0x047b, B:279:0x0481, B:281:0x0492, B:282:0x049d, B:285:0x04a6, B:287:0x04ac, B:290:0x04b2, B:292:0x04bc, B:294:0x04c4, B:298:0x04d6, B:301:0x04de, B:302:0x04e0, B:304:0x04e5, B:306:0x04ee, B:307:0x04f2, B:309:0x04f7, B:310:0x04fa, B:312:0x0500, B:314:0x0507, B:320:0x0514, B:321:0x052c, B:324:0x0533, B:326:0x0540, B:329:0x0553, B:331:0x0560, B:332:0x056d, B:336:0x0577, B:339:0x0580, B:342:0x058d, B:343:0x0593, B:346:0x059b, B:349:0x05a8, B:350:0x05ae, B:352:0x05b7, B:355:0x05c4, B:356:0x05ca, B:359:0x05d5, B:362:0x05e2, B:363:0x05e8, B:366:0x05f3, B:369:0x0600, B:370:0x0606, B:371:0x060d, B:373:0x0612, B:377:0x061c, B:378:0x0634, B:379:0x0635, B:381:0x0646, B:382:0x064a, B:384:0x0653, B:391:0x0665, B:392:0x067d, B:393:0x067e, B:394:0x0696, B:395:0x0697, B:396:0x06af), top: B:403:0x0065, inners: #0, #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:307:0x04f2 A[Catch: all -> 0x0075, TryCatch #2 {all -> 0x0075, blocks: (B:20:0x0065, B:23:0x006f, B:28:0x007c, B:31:0x0091, B:33:0x009b, B:36:0x00a3, B:37:0x00c1, B:41:0x00c9, B:44:0x00d4, B:45:0x00da, B:51:0x00ed, B:53:0x00f7, B:54:0x00fa, B:57:0x00ff, B:58:0x0115, B:70:0x012c, B:71:0x0131, B:73:0x0136, B:74:0x013b, B:76:0x0143, B:77:0x0147, B:80:0x014d, B:81:0x0165, B:82:0x0166, B:83:0x017e, B:89:0x0188, B:92:0x0197, B:93:0x019d, B:94:0x01bb, B:95:0x01bc, B:98:0x01c8, B:101:0x01d5, B:102:0x01db, B:118:0x01fa, B:121:0x0204, B:122:0x0209, B:124:0x020f, B:126:0x0217, B:128:0x022a, B:130:0x0237, B:132:0x0240, B:133:0x0243, B:135:0x024d, B:136:0x025b, B:138:0x0261, B:140:0x026f, B:142:0x0277, B:149:0x0288, B:150:0x028e, B:152:0x0297, B:153:0x029c, B:157:0x02a5, B:158:0x02ad, B:159:0x02ae, B:161:0x02b5, B:163:0x02b9, B:164:0x02bc, B:166:0x02c2, B:170:0x02d0, B:177:0x02e6, B:179:0x02ee, B:181:0x02f5, B:183:0x0304, B:185:0x030c, B:188:0x0311, B:190:0x0315, B:191:0x0318, B:193:0x0320, B:196:0x0326, B:197:0x0332, B:200:0x033b, B:203:0x0341, B:206:0x0347, B:207:0x0353, B:209:0x035f, B:211:0x0363, B:215:0x036d, B:216:0x0385, B:217:0x0386, B:218:0x03a3, B:221:0x03a8, B:227:0x03ba, B:229:0x03c0, B:231:0x03cc, B:232:0x03d2, B:234:0x03d7, B:235:0x03db, B:243:0x03ee, B:246:0x03fa, B:249:0x040b, B:250:0x0411, B:252:0x041a, B:255:0x0423, B:256:0x0426, B:258:0x0430, B:259:0x0434, B:260:0x0437, B:262:0x043b, B:271:0x0451, B:272:0x0469, B:275:0x046e, B:278:0x047b, B:279:0x0481, B:281:0x0492, B:282:0x049d, B:285:0x04a6, B:287:0x04ac, B:290:0x04b2, B:292:0x04bc, B:294:0x04c4, B:298:0x04d6, B:301:0x04de, B:302:0x04e0, B:304:0x04e5, B:306:0x04ee, B:307:0x04f2, B:309:0x04f7, B:310:0x04fa, B:312:0x0500, B:314:0x0507, B:320:0x0514, B:321:0x052c, B:324:0x0533, B:326:0x0540, B:329:0x0553, B:331:0x0560, B:332:0x056d, B:336:0x0577, B:339:0x0580, B:342:0x058d, B:343:0x0593, B:346:0x059b, B:349:0x05a8, B:350:0x05ae, B:352:0x05b7, B:355:0x05c4, B:356:0x05ca, B:359:0x05d5, B:362:0x05e2, B:363:0x05e8, B:366:0x05f3, B:369:0x0600, B:370:0x0606, B:371:0x060d, B:373:0x0612, B:377:0x061c, B:378:0x0634, B:379:0x0635, B:381:0x0646, B:382:0x064a, B:384:0x0653, B:391:0x0665, B:392:0x067d, B:393:0x067e, B:394:0x0696, B:395:0x0697, B:396:0x06af), top: B:403:0x0065, inners: #0, #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:309:0x04f7 A[Catch: all -> 0x0075, TryCatch #2 {all -> 0x0075, blocks: (B:20:0x0065, B:23:0x006f, B:28:0x007c, B:31:0x0091, B:33:0x009b, B:36:0x00a3, B:37:0x00c1, B:41:0x00c9, B:44:0x00d4, B:45:0x00da, B:51:0x00ed, B:53:0x00f7, B:54:0x00fa, B:57:0x00ff, B:58:0x0115, B:70:0x012c, B:71:0x0131, B:73:0x0136, B:74:0x013b, B:76:0x0143, B:77:0x0147, B:80:0x014d, B:81:0x0165, B:82:0x0166, B:83:0x017e, B:89:0x0188, B:92:0x0197, B:93:0x019d, B:94:0x01bb, B:95:0x01bc, B:98:0x01c8, B:101:0x01d5, B:102:0x01db, B:118:0x01fa, B:121:0x0204, B:122:0x0209, B:124:0x020f, B:126:0x0217, B:128:0x022a, B:130:0x0237, B:132:0x0240, B:133:0x0243, B:135:0x024d, B:136:0x025b, B:138:0x0261, B:140:0x026f, B:142:0x0277, B:149:0x0288, B:150:0x028e, B:152:0x0297, B:153:0x029c, B:157:0x02a5, B:158:0x02ad, B:159:0x02ae, B:161:0x02b5, B:163:0x02b9, B:164:0x02bc, B:166:0x02c2, B:170:0x02d0, B:177:0x02e6, B:179:0x02ee, B:181:0x02f5, B:183:0x0304, B:185:0x030c, B:188:0x0311, B:190:0x0315, B:191:0x0318, B:193:0x0320, B:196:0x0326, B:197:0x0332, B:200:0x033b, B:203:0x0341, B:206:0x0347, B:207:0x0353, B:209:0x035f, B:211:0x0363, B:215:0x036d, B:216:0x0385, B:217:0x0386, B:218:0x03a3, B:221:0x03a8, B:227:0x03ba, B:229:0x03c0, B:231:0x03cc, B:232:0x03d2, B:234:0x03d7, B:235:0x03db, B:243:0x03ee, B:246:0x03fa, B:249:0x040b, B:250:0x0411, B:252:0x041a, B:255:0x0423, B:256:0x0426, B:258:0x0430, B:259:0x0434, B:260:0x0437, B:262:0x043b, B:271:0x0451, B:272:0x0469, B:275:0x046e, B:278:0x047b, B:279:0x0481, B:281:0x0492, B:282:0x049d, B:285:0x04a6, B:287:0x04ac, B:290:0x04b2, B:292:0x04bc, B:294:0x04c4, B:298:0x04d6, B:301:0x04de, B:302:0x04e0, B:304:0x04e5, B:306:0x04ee, B:307:0x04f2, B:309:0x04f7, B:310:0x04fa, B:312:0x0500, B:314:0x0507, B:320:0x0514, B:321:0x052c, B:324:0x0533, B:326:0x0540, B:329:0x0553, B:331:0x0560, B:332:0x056d, B:336:0x0577, B:339:0x0580, B:342:0x058d, B:343:0x0593, B:346:0x059b, B:349:0x05a8, B:350:0x05ae, B:352:0x05b7, B:355:0x05c4, B:356:0x05ca, B:359:0x05d5, B:362:0x05e2, B:363:0x05e8, B:366:0x05f3, B:369:0x0600, B:370:0x0606, B:371:0x060d, B:373:0x0612, B:377:0x061c, B:378:0x0634, B:379:0x0635, B:381:0x0646, B:382:0x064a, B:384:0x0653, B:391:0x0665, B:392:0x067d, B:393:0x067e, B:394:0x0696, B:395:0x0697, B:396:0x06af), top: B:403:0x0065, inners: #0, #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:318:0x050e  */
    /* JADX WARN: Removed duplicated region for block: B:334:0x0573  */
    /* JADX WARN: Removed duplicated region for block: B:339:0x0580 A[Catch: all -> 0x0075, TryCatch #2 {all -> 0x0075, blocks: (B:20:0x0065, B:23:0x006f, B:28:0x007c, B:31:0x0091, B:33:0x009b, B:36:0x00a3, B:37:0x00c1, B:41:0x00c9, B:44:0x00d4, B:45:0x00da, B:51:0x00ed, B:53:0x00f7, B:54:0x00fa, B:57:0x00ff, B:58:0x0115, B:70:0x012c, B:71:0x0131, B:73:0x0136, B:74:0x013b, B:76:0x0143, B:77:0x0147, B:80:0x014d, B:81:0x0165, B:82:0x0166, B:83:0x017e, B:89:0x0188, B:92:0x0197, B:93:0x019d, B:94:0x01bb, B:95:0x01bc, B:98:0x01c8, B:101:0x01d5, B:102:0x01db, B:118:0x01fa, B:121:0x0204, B:122:0x0209, B:124:0x020f, B:126:0x0217, B:128:0x022a, B:130:0x0237, B:132:0x0240, B:133:0x0243, B:135:0x024d, B:136:0x025b, B:138:0x0261, B:140:0x026f, B:142:0x0277, B:149:0x0288, B:150:0x028e, B:152:0x0297, B:153:0x029c, B:157:0x02a5, B:158:0x02ad, B:159:0x02ae, B:161:0x02b5, B:163:0x02b9, B:164:0x02bc, B:166:0x02c2, B:170:0x02d0, B:177:0x02e6, B:179:0x02ee, B:181:0x02f5, B:183:0x0304, B:185:0x030c, B:188:0x0311, B:190:0x0315, B:191:0x0318, B:193:0x0320, B:196:0x0326, B:197:0x0332, B:200:0x033b, B:203:0x0341, B:206:0x0347, B:207:0x0353, B:209:0x035f, B:211:0x0363, B:215:0x036d, B:216:0x0385, B:217:0x0386, B:218:0x03a3, B:221:0x03a8, B:227:0x03ba, B:229:0x03c0, B:231:0x03cc, B:232:0x03d2, B:234:0x03d7, B:235:0x03db, B:243:0x03ee, B:246:0x03fa, B:249:0x040b, B:250:0x0411, B:252:0x041a, B:255:0x0423, B:256:0x0426, B:258:0x0430, B:259:0x0434, B:260:0x0437, B:262:0x043b, B:271:0x0451, B:272:0x0469, B:275:0x046e, B:278:0x047b, B:279:0x0481, B:281:0x0492, B:282:0x049d, B:285:0x04a6, B:287:0x04ac, B:290:0x04b2, B:292:0x04bc, B:294:0x04c4, B:298:0x04d6, B:301:0x04de, B:302:0x04e0, B:304:0x04e5, B:306:0x04ee, B:307:0x04f2, B:309:0x04f7, B:310:0x04fa, B:312:0x0500, B:314:0x0507, B:320:0x0514, B:321:0x052c, B:324:0x0533, B:326:0x0540, B:329:0x0553, B:331:0x0560, B:332:0x056d, B:336:0x0577, B:339:0x0580, B:342:0x058d, B:343:0x0593, B:346:0x059b, B:349:0x05a8, B:350:0x05ae, B:352:0x05b7, B:355:0x05c4, B:356:0x05ca, B:359:0x05d5, B:362:0x05e2, B:363:0x05e8, B:366:0x05f3, B:369:0x0600, B:370:0x0606, B:371:0x060d, B:373:0x0612, B:377:0x061c, B:378:0x0634, B:379:0x0635, B:381:0x0646, B:382:0x064a, B:384:0x0653, B:391:0x0665, B:392:0x067d, B:393:0x067e, B:394:0x0696, B:395:0x0697, B:396:0x06af), top: B:403:0x0065, inners: #0, #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:427:0x0500 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:432:0x0597 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01c8 A[Catch: all -> 0x0075, TryCatch #2 {all -> 0x0075, blocks: (B:20:0x0065, B:23:0x006f, B:28:0x007c, B:31:0x0091, B:33:0x009b, B:36:0x00a3, B:37:0x00c1, B:41:0x00c9, B:44:0x00d4, B:45:0x00da, B:51:0x00ed, B:53:0x00f7, B:54:0x00fa, B:57:0x00ff, B:58:0x0115, B:70:0x012c, B:71:0x0131, B:73:0x0136, B:74:0x013b, B:76:0x0143, B:77:0x0147, B:80:0x014d, B:81:0x0165, B:82:0x0166, B:83:0x017e, B:89:0x0188, B:92:0x0197, B:93:0x019d, B:94:0x01bb, B:95:0x01bc, B:98:0x01c8, B:101:0x01d5, B:102:0x01db, B:118:0x01fa, B:121:0x0204, B:122:0x0209, B:124:0x020f, B:126:0x0217, B:128:0x022a, B:130:0x0237, B:132:0x0240, B:133:0x0243, B:135:0x024d, B:136:0x025b, B:138:0x0261, B:140:0x026f, B:142:0x0277, B:149:0x0288, B:150:0x028e, B:152:0x0297, B:153:0x029c, B:157:0x02a5, B:158:0x02ad, B:159:0x02ae, B:161:0x02b5, B:163:0x02b9, B:164:0x02bc, B:166:0x02c2, B:170:0x02d0, B:177:0x02e6, B:179:0x02ee, B:181:0x02f5, B:183:0x0304, B:185:0x030c, B:188:0x0311, B:190:0x0315, B:191:0x0318, B:193:0x0320, B:196:0x0326, B:197:0x0332, B:200:0x033b, B:203:0x0341, B:206:0x0347, B:207:0x0353, B:209:0x035f, B:211:0x0363, B:215:0x036d, B:216:0x0385, B:217:0x0386, B:218:0x03a3, B:221:0x03a8, B:227:0x03ba, B:229:0x03c0, B:231:0x03cc, B:232:0x03d2, B:234:0x03d7, B:235:0x03db, B:243:0x03ee, B:246:0x03fa, B:249:0x040b, B:250:0x0411, B:252:0x041a, B:255:0x0423, B:256:0x0426, B:258:0x0430, B:259:0x0434, B:260:0x0437, B:262:0x043b, B:271:0x0451, B:272:0x0469, B:275:0x046e, B:278:0x047b, B:279:0x0481, B:281:0x0492, B:282:0x049d, B:285:0x04a6, B:287:0x04ac, B:290:0x04b2, B:292:0x04bc, B:294:0x04c4, B:298:0x04d6, B:301:0x04de, B:302:0x04e0, B:304:0x04e5, B:306:0x04ee, B:307:0x04f2, B:309:0x04f7, B:310:0x04fa, B:312:0x0500, B:314:0x0507, B:320:0x0514, B:321:0x052c, B:324:0x0533, B:326:0x0540, B:329:0x0553, B:331:0x0560, B:332:0x056d, B:336:0x0577, B:339:0x0580, B:342:0x058d, B:343:0x0593, B:346:0x059b, B:349:0x05a8, B:350:0x05ae, B:352:0x05b7, B:355:0x05c4, B:356:0x05ca, B:359:0x05d5, B:362:0x05e2, B:363:0x05e8, B:366:0x05f3, B:369:0x0600, B:370:0x0606, B:371:0x060d, B:373:0x0612, B:377:0x061c, B:378:0x0634, B:379:0x0635, B:381:0x0646, B:382:0x064a, B:384:0x0653, B:391:0x0665, B:392:0x067d, B:393:0x067e, B:394:0x0696, B:395:0x0697, B:396:0x06af), top: B:403:0x0065, inners: #0, #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object parseObject(java.util.Map r20, java.lang.Object r21) {
        /*
            Method dump skipped, instructions count: 1717
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson.parser.DefaultJSONParser.parseObject(java.util.Map, java.lang.Object):java.lang.Object");
    }

    public String parseString() {
        JSONLexer jSONLexer = this.lexer;
        int i = jSONLexer.token;
        if (i == 4) {
            String stringVal = jSONLexer.stringVal();
            JSONLexer jSONLexer2 = this.lexer;
            char c = jSONLexer2.ch;
            char c2 = JSONLexer.EOI;
            if (c == ',') {
                int i2 = jSONLexer2.bp + 1;
                jSONLexer2.bp = i2;
                if (i2 < jSONLexer2.len) {
                    c2 = jSONLexer2.text.charAt(i2);
                }
                jSONLexer2.ch = c2;
                this.lexer.token = 16;
            } else if (c == ']') {
                int i3 = jSONLexer2.bp + 1;
                jSONLexer2.bp = i3;
                if (i3 < jSONLexer2.len) {
                    c2 = jSONLexer2.text.charAt(i3);
                }
                jSONLexer2.ch = c2;
                this.lexer.token = 15;
            } else if (c == '}') {
                int i4 = jSONLexer2.bp + 1;
                jSONLexer2.bp = i4;
                if (i4 < jSONLexer2.len) {
                    c2 = jSONLexer2.text.charAt(i4);
                }
                jSONLexer2.ch = c2;
                this.lexer.token = 13;
            } else {
                jSONLexer2.nextToken();
            }
            return stringVal;
        } else if (i == 2) {
            String numberString = jSONLexer.numberString();
            this.lexer.nextToken(16);
            return numberString;
        } else {
            Object parse = parse();
            if (parse == null) {
                return null;
            }
            return parse.toString();
        }
    }

    public void popContext() {
        this.contex = this.contex.parent;
        ParseContext[] parseContextArr = this.contextArray;
        int i = this.contextArrayIndex;
        parseContextArr[i - 1] = null;
        this.contextArrayIndex = i - 1;
    }

    public void setContext(ParseContext parseContext) {
        if (!this.lexer.disableCircularReferenceDetect) {
            this.contex = parseContext;
        }
    }

    public void setDateFomrat(DateFormat dateFormat) {
        this.dateFormat = dateFormat;
    }

    public void setDateFormat(String str) {
        this.dateFormatPattern = str;
        this.dateFormat = null;
    }

    public DefaultJSONParser(String str, ParserConfig parserConfig) {
        this(new JSONLexer(str, JSON.DEFAULT_PARSER_FEATURE), parserConfig);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public Object parse(Object obj) {
        JSONLexer jSONLexer = this.lexer;
        int i = jSONLexer.token;
        if (i != 2) {
            boolean z = true;
            if (i == 3) {
                if ((jSONLexer.features & Feature.UseBigDecimal.mask) == 0) {
                    z = false;
                }
                Number decimalValue = jSONLexer.decimalValue(z);
                this.lexer.nextToken();
                return decimalValue;
            } else if (i == 4) {
                String stringVal = jSONLexer.stringVal();
                this.lexer.nextToken(16);
                if ((this.lexer.features & Feature.AllowISO8601DateFormat.mask) != 0) {
                    JSONLexer jSONLexer2 = new JSONLexer(stringVal);
                    try {
                        if (jSONLexer2.scanISO8601DateIfMatch(true)) {
                            return jSONLexer2.calendar.getTime();
                        }
                    } finally {
                        jSONLexer2.close();
                    }
                }
                return stringVal;
            } else if (i == 12) {
                return parseObject((jSONLexer.features & Feature.OrderedField.mask) != 0 ? new JSONObject(new LinkedHashMap()) : new JSONObject(), obj);
            } else if (i != 14) {
                switch (i) {
                    case 6:
                        jSONLexer.nextToken(16);
                        return Boolean.TRUE;
                    case 7:
                        jSONLexer.nextToken(16);
                        return Boolean.FALSE;
                    case 8:
                        break;
                    case 9:
                        jSONLexer.nextToken(18);
                        JSONLexer jSONLexer3 = this.lexer;
                        if (jSONLexer3.token == 18) {
                            jSONLexer3.nextToken(10);
                            accept(10);
                            long longValue = this.lexer.integerValue().longValue();
                            accept(2);
                            accept(11);
                            return new Date(longValue);
                        }
                        throw new JSONException("syntax error, " + this.lexer.info());
                    default:
                        switch (i) {
                            case 20:
                                if (jSONLexer.isBlankInput()) {
                                    return null;
                                }
                                throw new JSONException("syntax error, " + this.lexer.info());
                            case 21:
                                jSONLexer.nextToken();
                                HashSet hashSet = new HashSet();
                                parseArray(hashSet, obj);
                                return hashSet;
                            case 22:
                                jSONLexer.nextToken();
                                TreeSet treeSet = new TreeSet();
                                parseArray(treeSet, obj);
                                return treeSet;
                            case 23:
                                break;
                            default:
                                throw new JSONException("syntax error, " + this.lexer.info());
                        }
                }
                jSONLexer.nextToken();
                return null;
            } else {
                JSONArray jSONArray = new JSONArray();
                parseArray(jSONArray, obj);
                return jSONArray;
            }
        } else {
            Number integerValue = jSONLexer.integerValue();
            this.lexer.nextToken();
            return integerValue;
        }
    }

    public DefaultJSONParser(String str, ParserConfig parserConfig, int i) {
        this(new JSONLexer(str, i), parserConfig);
    }

    public void parseArray(Class<?> cls, Collection collection) {
        parseArray((Type) cls, collection);
    }

    public ParseContext setContext(ParseContext parseContext, Object obj, Object obj2) {
        if (this.lexer.disableCircularReferenceDetect) {
            return null;
        }
        this.contex = new ParseContext(parseContext, obj, obj2);
        int i = this.contextArrayIndex;
        this.contextArrayIndex = i + 1;
        ParseContext[] parseContextArr = this.contextArray;
        if (parseContextArr == null) {
            this.contextArray = new ParseContext[8];
        } else if (i >= parseContextArr.length) {
            ParseContext[] parseContextArr2 = new ParseContext[(parseContextArr.length * 3) / 2];
            System.arraycopy(parseContextArr, 0, parseContextArr2, 0, parseContextArr.length);
            this.contextArray = parseContextArr2;
        }
        ParseContext[] parseContextArr3 = this.contextArray;
        ParseContext parseContext2 = this.contex;
        parseContextArr3[i] = parseContext2;
        return parseContext2;
    }

    public DefaultJSONParser(char[] cArr, int i, ParserConfig parserConfig, int i2) {
        this(new JSONLexer(cArr, i, i2), parserConfig);
    }

    public void parseArray(Type type, Collection collection) {
        parseArray(type, collection, null);
    }

    public DefaultJSONParser(JSONLexer jSONLexer) {
        this(jSONLexer, ParserConfig.global);
    }

    /* JADX WARN: Finally extract failed */
    public void parseArray(Type type, Collection collection, Object obj) {
        ObjectDeserializer objectDeserializer;
        JSONLexer jSONLexer = this.lexer;
        int i = jSONLexer.token;
        if (i == 21 || i == 22) {
            jSONLexer.nextToken();
        }
        JSONLexer jSONLexer2 = this.lexer;
        if (jSONLexer2.token == 14) {
            if (Integer.TYPE == type) {
                objectDeserializer = IntegerCodec.instance;
                jSONLexer2.nextToken(2);
            } else if (String.class == type) {
                objectDeserializer = StringCodec.instance;
                jSONLexer2.nextToken(4);
            } else {
                objectDeserializer = this.config.getDeserializer(type);
                this.lexer.nextToken(12);
            }
            ParseContext parseContext = this.contex;
            if (!this.lexer.disableCircularReferenceDetect) {
                setContext(parseContext, collection, obj);
            }
            int i2 = 0;
            while (true) {
                try {
                    JSONLexer jSONLexer3 = this.lexer;
                    int i3 = jSONLexer3.token;
                    if (i3 == 16) {
                        jSONLexer3.nextToken();
                    } else if (i3 == 15) {
                        this.contex = parseContext;
                        jSONLexer3.nextToken(16);
                        return;
                    } else {
                        Object obj2 = null;
                        if (Integer.TYPE == type) {
                            collection.add(IntegerCodec.instance.deserialze(this, null, null));
                        } else if (String.class == type) {
                            if (i3 == 4) {
                                obj2 = jSONLexer3.stringVal();
                                this.lexer.nextToken(16);
                            } else {
                                Object parse = parse();
                                if (parse != null) {
                                    obj2 = parse.toString();
                                }
                            }
                            collection.add(obj2);
                        } else {
                            if (i3 == 8) {
                                jSONLexer3.nextToken();
                            } else {
                                obj2 = objectDeserializer.deserialze(this, type, Integer.valueOf(i2));
                            }
                            collection.add(obj2);
                            if (this.resolveStatus == 1) {
                                checkListResolve(collection);
                            }
                        }
                        JSONLexer jSONLexer4 = this.lexer;
                        if (jSONLexer4.token == 16) {
                            jSONLexer4.nextToken();
                        }
                        i2++;
                    }
                } catch (Throwable th) {
                    this.contex = parseContext;
                    throw th;
                }
            }
        } else {
            throw new JSONException("exepct '[', but " + JSONToken.name(this.lexer.token) + ", " + this.lexer.info());
        }
    }

    public DefaultJSONParser(JSONLexer jSONLexer, ParserConfig parserConfig) {
        this.dateFormatPattern = JSON.DEFFAULT_DATE_FORMAT;
        this.contextArrayIndex = 0;
        this.resolveStatus = 0;
        this.extraTypeProviders = null;
        this.extraProcessors = null;
        this.fieldTypeResolver = null;
        this.lexer = jSONLexer;
        this.config = parserConfig;
        this.symbolTable = parserConfig.symbolTable;
        char c = jSONLexer.ch;
        char c2 = JSONLexer.EOI;
        if (c == '{') {
            int i = jSONLexer.bp + 1;
            jSONLexer.bp = i;
            jSONLexer.ch = i < jSONLexer.len ? jSONLexer.text.charAt(i) : c2;
            jSONLexer.token = 12;
        } else if (c == '[') {
            int i2 = jSONLexer.bp + 1;
            jSONLexer.bp = i2;
            jSONLexer.ch = i2 < jSONLexer.len ? jSONLexer.text.charAt(i2) : c2;
            jSONLexer.token = 14;
        } else {
            jSONLexer.nextToken();
        }
    }

    public Object[] parseArray(Type[] typeArr) {
        Object obj;
        boolean z;
        Class<?> cls;
        int i;
        JSONLexer jSONLexer = this.lexer;
        int i2 = jSONLexer.token;
        int i3 = 8;
        if (i2 == 8) {
            jSONLexer.nextToken(16);
            return null;
        } else if (i2 == 14) {
            Object[] objArr = new Object[typeArr.length];
            if (typeArr.length == 0) {
                jSONLexer.nextToken(15);
                JSONLexer jSONLexer2 = this.lexer;
                if (jSONLexer2.token == 15) {
                    jSONLexer2.nextToken(16);
                    return new Object[0];
                }
                throw new JSONException("syntax error, " + this.lexer.info());
            }
            jSONLexer.nextToken(2);
            int i4 = 0;
            while (i4 < typeArr.length) {
                JSONLexer jSONLexer3 = this.lexer;
                int i5 = jSONLexer3.token;
                if (i5 == i3) {
                    jSONLexer3.nextToken(16);
                    obj = null;
                } else {
                    Type type = typeArr[i4];
                    if (type == Integer.TYPE || type == Integer.class) {
                        if (i5 == 2) {
                            obj = Integer.valueOf(jSONLexer3.intValue());
                            this.lexer.nextToken(16);
                        } else {
                            obj = TypeUtils.cast(parse(), type, this.config);
                        }
                    } else if (type != String.class) {
                        if (i4 != typeArr.length - 1 || !(type instanceof Class)) {
                            cls = null;
                            z = false;
                        } else {
                            Class cls2 = (Class) type;
                            z = cls2.isArray();
                            cls = cls2.getComponentType();
                        }
                        if (!z || this.lexer.token == 14) {
                            obj = this.config.getDeserializer(type).deserialze(this, type, null);
                        } else {
                            ArrayList arrayList = new ArrayList();
                            ObjectDeserializer deserializer = this.config.getDeserializer(cls);
                            if (this.lexer.token != 15) {
                                while (true) {
                                    arrayList.add(deserializer.deserialze(this, type, null));
                                    JSONLexer jSONLexer4 = this.lexer;
                                    i = jSONLexer4.token;
                                    if (i != 16) {
                                        break;
                                    }
                                    jSONLexer4.nextToken(12);
                                }
                                if (i != 15) {
                                    throw new JSONException("syntax error, " + this.lexer.info());
                                }
                            }
                            obj = TypeUtils.cast(arrayList, type, this.config);
                        }
                    } else if (i5 == 4) {
                        obj = jSONLexer3.stringVal();
                        this.lexer.nextToken(16);
                    } else {
                        obj = TypeUtils.cast(parse(), type, this.config);
                    }
                }
                objArr[i4] = obj;
                JSONLexer jSONLexer5 = this.lexer;
                int i6 = jSONLexer5.token;
                if (i6 == 15) {
                    break;
                } else if (i6 == 16) {
                    if (i4 == typeArr.length - 1) {
                        jSONLexer5.nextToken(15);
                    } else {
                        jSONLexer5.nextToken(2);
                    }
                    i4++;
                    i3 = 8;
                } else {
                    throw new JSONException("syntax error, " + this.lexer.info());
                }
            }
            JSONLexer jSONLexer6 = this.lexer;
            if (jSONLexer6.token == 15) {
                jSONLexer6.nextToken(16);
                return objArr;
            }
            throw new JSONException("syntax error, " + this.lexer.info());
        } else {
            throw new JSONException("syntax error, " + this.lexer.info());
        }
    }

    public final void parseArray(Collection collection) {
        parseArray(collection, (Object) null);
    }

    /* JADX WARN: Removed duplicated region for block: B:113:0x01da A[Catch: all -> 0x0049, TryCatch #0 {all -> 0x0049, blocks: (B:12:0x0028, B:15:0x003c, B:21:0x004e, B:24:0x005a, B:25:0x0060, B:26:0x0067, B:28:0x006c, B:31:0x0077, B:34:0x007e, B:36:0x0084, B:38:0x0090, B:41:0x009c, B:42:0x00a2, B:44:0x00ab, B:47:0x00b3, B:49:0x00bc, B:52:0x00c8, B:53:0x00ce, B:55:0x00d7, B:56:0x00da, B:60:0x00e4, B:61:0x00e7, B:63:0x00ed, B:84:0x011c, B:86:0x0124, B:90:0x012e, B:91:0x013b, B:92:0x0143, B:93:0x014b, B:94:0x014c, B:96:0x0159, B:97:0x0164, B:98:0x0169, B:99:0x0172, B:100:0x017a, B:101:0x0184, B:102:0x018e, B:104:0x01a6, B:106:0x01b1, B:107:0x01b7, B:108:0x01bc, B:110:0x01c9, B:111:0x01cf, B:112:0x01d4, B:113:0x01da, B:114:0x01e8, B:116:0x01ef, B:117:0x01f2, B:119:0x01f8, B:121:0x01fc, B:126:0x020c, B:129:0x0218, B:132:0x0226, B:133:0x022c, B:134:0x022f), top: B:141:0x0028 }] */
    /* JADX WARN: Removed duplicated region for block: B:116:0x01ef A[Catch: all -> 0x0049, TryCatch #0 {all -> 0x0049, blocks: (B:12:0x0028, B:15:0x003c, B:21:0x004e, B:24:0x005a, B:25:0x0060, B:26:0x0067, B:28:0x006c, B:31:0x0077, B:34:0x007e, B:36:0x0084, B:38:0x0090, B:41:0x009c, B:42:0x00a2, B:44:0x00ab, B:47:0x00b3, B:49:0x00bc, B:52:0x00c8, B:53:0x00ce, B:55:0x00d7, B:56:0x00da, B:60:0x00e4, B:61:0x00e7, B:63:0x00ed, B:84:0x011c, B:86:0x0124, B:90:0x012e, B:91:0x013b, B:92:0x0143, B:93:0x014b, B:94:0x014c, B:96:0x0159, B:97:0x0164, B:98:0x0169, B:99:0x0172, B:100:0x017a, B:101:0x0184, B:102:0x018e, B:104:0x01a6, B:106:0x01b1, B:107:0x01b7, B:108:0x01bc, B:110:0x01c9, B:111:0x01cf, B:112:0x01d4, B:113:0x01da, B:114:0x01e8, B:116:0x01ef, B:117:0x01f2, B:119:0x01f8, B:121:0x01fc, B:126:0x020c, B:129:0x0218, B:132:0x0226, B:133:0x022c, B:134:0x022f), top: B:141:0x0028 }] */
    /* JADX WARN: Removed duplicated region for block: B:119:0x01f8 A[Catch: all -> 0x0049, TryCatch #0 {all -> 0x0049, blocks: (B:12:0x0028, B:15:0x003c, B:21:0x004e, B:24:0x005a, B:25:0x0060, B:26:0x0067, B:28:0x006c, B:31:0x0077, B:34:0x007e, B:36:0x0084, B:38:0x0090, B:41:0x009c, B:42:0x00a2, B:44:0x00ab, B:47:0x00b3, B:49:0x00bc, B:52:0x00c8, B:53:0x00ce, B:55:0x00d7, B:56:0x00da, B:60:0x00e4, B:61:0x00e7, B:63:0x00ed, B:84:0x011c, B:86:0x0124, B:90:0x012e, B:91:0x013b, B:92:0x0143, B:93:0x014b, B:94:0x014c, B:96:0x0159, B:97:0x0164, B:98:0x0169, B:99:0x0172, B:100:0x017a, B:101:0x0184, B:102:0x018e, B:104:0x01a6, B:106:0x01b1, B:107:0x01b7, B:108:0x01bc, B:110:0x01c9, B:111:0x01cf, B:112:0x01d4, B:113:0x01da, B:114:0x01e8, B:116:0x01ef, B:117:0x01f2, B:119:0x01f8, B:121:0x01fc, B:126:0x020c, B:129:0x0218, B:132:0x0226, B:133:0x022c, B:134:0x022f), top: B:141:0x0028 }] */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0232 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x007e A[Catch: all -> 0x0049, TryCatch #0 {all -> 0x0049, blocks: (B:12:0x0028, B:15:0x003c, B:21:0x004e, B:24:0x005a, B:25:0x0060, B:26:0x0067, B:28:0x006c, B:31:0x0077, B:34:0x007e, B:36:0x0084, B:38:0x0090, B:41:0x009c, B:42:0x00a2, B:44:0x00ab, B:47:0x00b3, B:49:0x00bc, B:52:0x00c8, B:53:0x00ce, B:55:0x00d7, B:56:0x00da, B:60:0x00e4, B:61:0x00e7, B:63:0x00ed, B:84:0x011c, B:86:0x0124, B:90:0x012e, B:91:0x013b, B:92:0x0143, B:93:0x014b, B:94:0x014c, B:96:0x0159, B:97:0x0164, B:98:0x0169, B:99:0x0172, B:100:0x017a, B:101:0x0184, B:102:0x018e, B:104:0x01a6, B:106:0x01b1, B:107:0x01b7, B:108:0x01bc, B:110:0x01c9, B:111:0x01cf, B:112:0x01d4, B:113:0x01da, B:114:0x01e8, B:116:0x01ef, B:117:0x01f2, B:119:0x01f8, B:121:0x01fc, B:126:0x020c, B:129:0x0218, B:132:0x0226, B:133:0x022c, B:134:0x022f), top: B:141:0x0028 }] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00ed A[Catch: all -> 0x0049, LOOP:1: B:62:0x00eb->B:63:0x00ed, LOOP_END, TryCatch #0 {all -> 0x0049, blocks: (B:12:0x0028, B:15:0x003c, B:21:0x004e, B:24:0x005a, B:25:0x0060, B:26:0x0067, B:28:0x006c, B:31:0x0077, B:34:0x007e, B:36:0x0084, B:38:0x0090, B:41:0x009c, B:42:0x00a2, B:44:0x00ab, B:47:0x00b3, B:49:0x00bc, B:52:0x00c8, B:53:0x00ce, B:55:0x00d7, B:56:0x00da, B:60:0x00e4, B:61:0x00e7, B:63:0x00ed, B:84:0x011c, B:86:0x0124, B:90:0x012e, B:91:0x013b, B:92:0x0143, B:93:0x014b, B:94:0x014c, B:96:0x0159, B:97:0x0164, B:98:0x0169, B:99:0x0172, B:100:0x017a, B:101:0x0184, B:102:0x018e, B:104:0x01a6, B:106:0x01b1, B:107:0x01b7, B:108:0x01bc, B:110:0x01c9, B:111:0x01cf, B:112:0x01d4, B:113:0x01da, B:114:0x01e8, B:116:0x01ef, B:117:0x01f2, B:119:0x01f8, B:121:0x01fc, B:126:0x020c, B:129:0x0218, B:132:0x0226, B:133:0x022c, B:134:0x022f), top: B:141:0x0028 }] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00fa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void parseArray(java.util.Collection r17, java.lang.Object r18) {
        /*
            Method dump skipped, instructions count: 612
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson.parser.DefaultJSONParser.parseArray(java.util.Collection, java.lang.Object):void");
    }

    public <T> T parseObject(Class<T> cls) {
        return (T) parseObject(cls, (Object) null);
    }

    public <T> T parseObject(Type type) {
        return (T) parseObject(type, (Object) null);
    }

    public <T> T parseObject(Type type, Object obj) {
        JSONLexer jSONLexer = this.lexer;
        int i = jSONLexer.token;
        if (i == 8) {
            jSONLexer.nextToken();
            return null;
        }
        if (i == 4) {
            if (type == byte[].class) {
                T t = (T) jSONLexer.bytesValue();
                this.lexer.nextToken();
                return t;
            } else if (type == char[].class) {
                String stringVal = jSONLexer.stringVal();
                this.lexer.nextToken();
                return (T) stringVal.toCharArray();
            }
        }
        try {
            return (T) this.config.getDeserializer(type).deserialze(this, type, obj);
        } catch (JSONException e) {
            throw e;
        } catch (Exception e2) {
            throw new JSONException(e2.getMessage(), e2);
        }
    }

    public void parseObject(Object obj) {
        Object obj2;
        Class<?> cls = obj.getClass();
        ObjectDeserializer deserializer = this.config.getDeserializer(cls);
        JavaBeanDeserializer javaBeanDeserializer = deserializer instanceof JavaBeanDeserializer ? (JavaBeanDeserializer) deserializer : null;
        int i = this.lexer.token;
        if (i == 12 || i == 16) {
            while (true) {
                String scanSymbol = this.lexer.scanSymbol(this.symbolTable);
                if (scanSymbol == null) {
                    JSONLexer jSONLexer = this.lexer;
                    int i2 = jSONLexer.token;
                    if (i2 == 13) {
                        jSONLexer.nextToken(16);
                        return;
                    } else if (i2 == 16) {
                        continue;
                    }
                }
                FieldDeserializer fieldDeserializer = javaBeanDeserializer != null ? javaBeanDeserializer.getFieldDeserializer(scanSymbol) : null;
                if (fieldDeserializer == null) {
                    JSONLexer jSONLexer2 = this.lexer;
                    if ((jSONLexer2.features & Feature.IgnoreNotMatch.mask) != 0) {
                        jSONLexer2.nextTokenWithChar(f7l.CONDITION_IF_MIDDLE);
                        parse();
                        JSONLexer jSONLexer3 = this.lexer;
                        if (jSONLexer3.token == 13) {
                            jSONLexer3.nextToken();
                            return;
                        }
                    } else {
                        throw new JSONException("setter not found, class " + cls.getName() + ", property " + scanSymbol);
                    }
                } else {
                    FieldInfo fieldInfo = fieldDeserializer.fieldInfo;
                    Class<?> cls2 = fieldInfo.fieldClass;
                    Type type = fieldInfo.fieldType;
                    if (cls2 == Integer.TYPE) {
                        this.lexer.nextTokenWithChar(f7l.CONDITION_IF_MIDDLE);
                        obj2 = IntegerCodec.instance.deserialze(this, type, null);
                    } else if (cls2 == String.class) {
                        this.lexer.nextTokenWithChar(f7l.CONDITION_IF_MIDDLE);
                        obj2 = parseString();
                    } else if (cls2 == Long.TYPE) {
                        this.lexer.nextTokenWithChar(f7l.CONDITION_IF_MIDDLE);
                        obj2 = IntegerCodec.instance.deserialze(this, type, null);
                    } else {
                        ObjectDeserializer deserializer2 = this.config.getDeserializer(cls2, type);
                        this.lexer.nextTokenWithChar(f7l.CONDITION_IF_MIDDLE);
                        obj2 = deserializer2.deserialze(this, type, null);
                    }
                    fieldDeserializer.setValue(obj, obj2);
                    JSONLexer jSONLexer4 = this.lexer;
                    int i3 = jSONLexer4.token;
                    if (i3 != 16 && i3 == 13) {
                        jSONLexer4.nextToken(16);
                        return;
                    }
                }
            }
        } else {
            throw new JSONException("syntax error, expect {, actual " + JSONToken.name(i));
        }
    }

    public Object parseObject(Map map) {
        return parseObject(map, (Object) null);
    }

    public JSONObject parseObject() {
        return (JSONObject) parseObject((this.lexer.features & Feature.OrderedField.mask) != 0 ? new JSONObject(new LinkedHashMap()) : new JSONObject(), (Object) null);
    }
}
