package it.polito.tdp.crimes.model;

import java.util.HashMap;
import java.util.Map;

import org.jgrapht.Graph;
import org.jgrapht.Graphs;
import org.jgrapht.graph.DefaultWeightedEdge;
import org.jgrapht.graph.SimpleWeightedGraph;

import it.polito.tdp.crimes.db.EventsDao;

public class Model {
	
	private EventsDao dao; 
	private Graph<Integer,DefaultWeightedEdge> grafo;
	private Map<Long,Event> idMap;
	
	public Model() {
		dao = new EventsDao(); 
	}
	
	public void creaGrafo(int anno) { 

		idMap = new HashMap<Long,Event>();
		
		for (Event e:dao.listAllEvents(anno)) { 
			idMap.put(e.getIncident_id(),e); 
		}
		
		grafo = new SimpleWeightedGraph<>(DefaultWeightedEdge.class);
			
		Graphs.addAllVertices(grafo, dao.listDistrictCodes()); 
			
		/*for(Adiacenza a:dao.getAdiacenze()) { 
		if (condizioni specificate) { 
			Graphs.addEdge(
					this.grafo, idMap.get(a.getId1()), idMap.get(a.getId2()), a.getPeso());
			res.add(a);
				}
		}*/
		
	    System.out.println("Numero di vertici: " + grafo.vertexSet().size());
	    System.out.println("Numero di archi: " + grafo.edgeSet().size());	
			
	}


	
}
