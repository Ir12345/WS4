package core;

import java.text.DecimalFormat;
import javax.ws.rs.DefaultValue;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;
import org.json.JSONArray;
import org.json.JSONObject;


@Path("/")
public class Imperial_to_Metric_Converter_JSONBuilder2{
	
	JSONObject json = new JSONObject();
	JSONObject json_array = new JSONObject();
	JSONObject json_array_arrays = new JSONObject();
	JSONArray array = new JSONArray();
	
	DecimalFormat df = new DecimalFormat("####0.00");
	
	@GET
	@Path("json/kg=>lb/{input}")
	@Produces("application/json")
	public Response kg_to_lb_json(
	@DefaultValue("1")
	@PathParam("input") Double input) {
	Double kg = input;
	Double lb = kg * 2.2046;
	String kg_out = df.format(kg).toString();
	String lb_out = df.format(lb).toString();
	
	json.put("calc", json_array);
	json_array.put("conversion", "kg to lb");
	json_array.put("kg", kg_out);
	json_array.put("lb", lb_out);
	

	json_array_arrays.put("length", "cm to in");
	json_array_arrays.put("temperature", "C to F");
	
	array.put(json_array_arrays);
	json_array.put("other conversions", array);
	
	String out = json.toString();
	
	return Response.status(200).entity(out).build();
	}
	
	@GET
	@Path("json/lb=>kg/{input}")
	@Produces("application/json")
	public Response lb_to_kg_json(
	@DefaultValue("1")
	@PathParam("input") Double input) {
	Double lb = input;
	Double kg = lb / 2.2046;
	String kg_out = df.format(kg).toString();
	String lb_out = df.format(lb).toString();
	
	json.put("calc", json_array);
	json_array.put("conversion", "lb to kg");
	json_array.put("lb", lb_out);
	json_array.put("kg", kg_out);

	json_array_arrays.put("length", "cm to in");
	json_array_arrays.put("temperature", "C to F");
	
	array.put(json_array_arrays);
	json_array.put("other conversions", array);
	
	String out = json.toString();
	
	return Response.status(200).entity(out).build();
	}
	
	@GET
	@Path("json/in=>cm/{input}")
	@Produces("application/json")
	public Response convertIntoCmfromInput(
	@DefaultValue("1")
	@PathParam("input") Double input) {
	//DecimalFormat df = new DecimalFormat("####0.00");
	Double in = input;
	Double cm = in * 2.54;
	String in_out = df.format(in).toString();
	String cm_out = df.format(cm).toString();
	
	json.put("calc", json_array);
	json_array.put("conversion", "inches to centimeters");
	json_array.put("in", in_out);
	json_array.put("cm", cm_out);
	

	json_array_arrays.put("length", "cm to in");
	json_array_arrays.put("temperature", "C to F");
	
	array.put(json_array_arrays);
	json_array.put("other conversions", array);
	
	String out = json.toString();
	
	return Response.status(200).entity(out).build();
		 
}
	@GET
	@Path("json/cm=>in/{input}")
	@Produces("application/json")
	public Response convertCmtoInfromInput(
	@DefaultValue("1")
	@PathParam("input") Double input) {
	//DecimalFormat df = new DecimalFormat("####0.00");
	Double cm = input;
	Double in = cm * 0.3937;
	String cm_out = df.format(cm).toString();
	String in_out = df.format(in).toString();
	
	json.put("calc", json_array);
	json_array.put("conversion", "centimeters to inches");
	json_array.put("cm", cm_out);
	json_array.put("in", in_out);

	json_array_arrays.put("length", "cm to in");
	json_array_arrays.put("temperature", "C to F");
	
	array.put(json_array_arrays);
	json_array.put("other conversions", array);
	
	String out = json.toString();
	
	return Response.status(200).entity(out).build();
		 	
}}
